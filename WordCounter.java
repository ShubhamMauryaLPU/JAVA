import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Sk maurya\\OneDrive\\Documents\\Ponniyin Selvan Part Two.txt"; // Path to your input text file

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            Map<String, Integer> wordCount = new HashMap<>();
            String line;

            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                // Split the line into words using space as delimiter
                String[] words = line.split(" ");

                // Count occurrences of each word
                for (String word : words) {
                    // Remove any punctuation marks
                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

                    // Update the word count map
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Display word counts
            System.out.println("Word Count:");
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
