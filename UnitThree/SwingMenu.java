package UnitThree;

import javax.swing.*;
import java.awt.*;

public class SwingMenu {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Swing Menu");
        frame.setSize(550, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);

        frame.getContentPane().setBackground(
                new Color(245, 248, 255));

        // Menu Bar
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem newItem = new JMenuItem("New");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem aboutItem = new JMenuItem("About");

        fileMenu.add(newItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);

        // Title
        JLabel title = new JLabel("User Registration");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setBounds(160, 20, 250, 30);
        frame.add(title);

        // Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(80, 100, 100, 25);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(180, 100, 220, 25);
        frame.add(nameField);

//        // Email
//        JLabel emailLabel = new JLabel("Email:");
//        emailLabel.setBounds(80, 150, 100, 25);
//        frame.add(emailLabel);
//
//        JTextField emailField = new JTextField();
//        emailField.setBounds(180, 150, 220, 25);
//        frame.add(emailField);
//
//        // Phone
//        JLabel phoneLabel = new JLabel("Phone:");
//        phoneLabel.setBounds(80, 200, 100, 25);
//        frame.add(phoneLabel);
//
//        JTextField phoneField = new JTextField();
//        phoneField.setBounds(180, 200, 220, 25);
//        frame.add(phoneField);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(200, 300, 120, 40);
        submitButton.setBackground(new Color(70, 130, 180));
        submitButton.setForeground(Color.WHITE);
        submitButton.setFocusPainted(false);
        frame.add(submitButton);

        // Submit Event
        submitButton.addActionListener(e -> {

            String name = nameField.getText();
//            String email = emailField.getText();
//            String phone = phoneField.getText();

            JOptionPane.showMessageDialog(
                    frame,
                    "Registration Successful\n\n" +
                            "Name: " + name + "\n"
//                            "Email: " + email + "\n" +
//                            "Phone: " + phone
            );
        });

        // New Menu Event
        newItem.addActionListener(e -> {
            nameField.setText("");
//            emailField.setText("");
//            phoneField.setText("");

            JOptionPane.showMessageDialog(
                    frame,
                    "New form created."
            );
        });

        // Save Menu Event
        saveItem.addActionListener(e ->
                JOptionPane.showMessageDialog(
                        frame,
                        "Data saved successfully."
                )
        );

        // Exit Menu Event
        exitItem.addActionListener(e -> {

            int choice = JOptionPane.showConfirmDialog(
                    frame,
                    "Are you sure you want to exit?",
                    "Exit",
                    JOptionPane.YES_NO_OPTION
            );

            if (choice == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });

        // About Menu Event
        aboutItem.addActionListener(e ->
                JOptionPane.showMessageDialog(
                        frame,
                        "Registration Form\nVersion 1.0"
                )
        );

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}