import Login.LoginPanel;
public class Main {
    public static void main(String[] args) {
        // Create a new instance of LoginPanel
        LoginPanel loginPanel = new LoginPanel();
        
        // Create a JFrame to hold the LoginPanel
        javax.swing.JFrame frame = new javax.swing.JFrame("Login Example");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        
        // Add the LoginPanel to the JFrame
        frame.getContentPane().add(loginPanel);
        
        // Set the size of the JFrame
        frame.pack();
        
        // Center the JFrame on the screen
        frame.setLocationRelativeTo(null);
        
        // Make the JFrame visible
        frame.setVisible(true);
    }
}

