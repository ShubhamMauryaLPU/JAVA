import javax.swing.*;

public class ques20 {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the window is closed
        frame.setSize(200, 200); // Set the size of the window
        
        // Create a JLabel (text label)
        JLabel label = new JLabel("Hello, World!");
        
        // Add the label to the frame's content pane
        frame.getContentPane().add(label);
        
        // Make the window visible
        frame.setVisible(true);
    }
}
