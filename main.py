# Code for image captioning using TensorFlow and Keras

import numpy as np
import tensorflow as tf
from tensorflow.keras.applications import InceptionV3
from tensorflow.keras.preprocessing import image
from tensorflow.keras.models import Model
from tensorflow.keras.layers import Input, Dense, Embedding, LSTM
from tensorflow.keras.preprocessing.sequence import pad_sequences

# Load pre-trained InceptionV3 model for image feature extraction
base_model = InceptionV3(weights='imagenet')
image_model = Model(inputs=base_model.input, outputs=base_model.layers[-2].output)

# Define image preprocessing function
def preprocess_image(img_path):
    img = image.load_img(img_path, target_size=(299, 299))
    img = image.img_to_array(img)
    img = np.expand_dims(img, axis=0)
    img = tf.keras.applications.inception_v3.preprocess_input(img)
    return img

# Load pre-trained word embeddings (e.g., GloVe)
# Assuming you have pre-trained word embeddings saved as a dictionary

# Define captioning model architecture
embedding_dim = 300
word_embeddings="shubham"
vocab_size = len(word_embeddings)  # Size of the vocabulary
max_seq_length = 20  # Maximum length of captions

input_image = Input(shape=(2048,))
image_dense = Dense(embedding_dim, activation='relu')(input_image)

input_caption = Input(shape=(max_seq_length,))
caption_embedding = Embedding(input_dim=vocab_size, output_dim=embedding_dim)(input_caption)
caption_lstm = LSTM(256)(caption_embedding)

decoder_input = tf.keras.layers.concatenate([image_dense, caption_lstm])
decoder_dense = Dense(vocab_size, activation='softmax')(decoder_input)

caption_model = Model(inputs=[input_image, input_caption], outputs=decoder_dense)

# Compile the model
caption_model.compile(loss='categorical_crossentropy', optimizer='adam')

# Train the model (assuming you have image-caption pairs as training data)
# Assuming train_images, train_captions, and train_targets are loaded

train_images = [...]  # List of paths to training images
train_captions = [...]  # List of training captions
train_targets = [...]  # List of target captions (shifted by one time step)
num_epochs=3
for epoch in range(num_epochs):
    for image_path, caption, target in zip(train_images, train_captions, train_targets):
        img = preprocess_image(image_path)
        img_features = image_model.predict(img)
        caption_seq = [word_embeddings[word] for word in caption.split() if word in word_embeddings]
        caption_seq = pad_sequences([caption_seq], maxlen=max_seq_length, padding='post')[0]
        caption_target = [word_embeddings[word] for word in target.split() if word in word_embeddings]
        caption_target = pad_sequences([caption_target], maxlen=max_seq_length, padding='post')[0]
        caption_model.train_on_batch([img_features, caption_seq], caption_target)

# Generate captions for new images
def generate_caption(image_path):
    img = preprocess_image(image_path)
    img_features = image_model.predict(img)
    caption = 'startseq'
    for _ in range(max_seq_length):
        caption_seq = [word_embeddings[word] for word in caption.split() if word in word_embeddings]
        caption_seq = pad_sequences([caption_seq], maxlen=max_seq_length, padding='post')[0]
        next_word_index = np.argmax(caption_model.predict([img_features, np.array([caption_seq])]))
        next_word = reverse_word_index[next_word_index]
        if next_word == 'endseq':
            break
        caption += ' ' + next_word
    return caption

# Example usage
image_path = 'example.jpg'
generated_caption = generate_caption(image_path)
print("Generated Caption:", generated_caption)
