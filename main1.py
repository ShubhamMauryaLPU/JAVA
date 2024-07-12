import turtle

# Create a turtle screen
screen = turtle.Screen()

# Create a turtle named "alex"
alex = turtle.Turtle()

# Function to draw a square
def draw_square():
    for _ in range(4):
        alex.forward(100)  # Move turtle forward by 100 units
        alex.left(90)      # Turn turtle left by 90 degrees

# Draw the square
draw_square()

# Keep the window open until it's closed by the user
turtle.done()
