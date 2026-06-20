package UnitThree;

import javax.swing.*;
import java.awt.*;

public class RegistrationForm {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Registration Form");
        frame.setSize(600, 600); // Increased height
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(245, 248, 255));

        // Title
        JLabel title = new JLabel("User Registration Form");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setBounds(170, 20, 300, 30);
        frame.add(title);

        Font labelFont = new Font("Arial", Font.BOLD, 14);

        // Full Name
        JLabel nameLabel = new JLabel("Full Name:");
        nameLabel.setFont(labelFont);
        nameLabel.setBounds(80, 80, 100, 25);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(200, 80, 250, 30);
        frame.add(nameField);

        // Email
        JLabel emailLabel = new JLabel("Email Address:");
        emailLabel.setFont(labelFont);
        emailLabel.setBounds(80, 130, 120, 25);
        frame.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(200, 130, 250, 30);
        frame.add(emailField);

        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setFont(labelFont);
        genderLabel.setBounds(80, 180, 100, 25);
        frame.add(genderLabel);

        JRadioButton maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setBounds(200, 180, 80, 30);
        maleRadioButton.setBackground(new Color(245, 248, 255));

        JRadioButton femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setBounds(300, 180, 90, 30);
        femaleRadioButton.setBackground(new Color(245, 248, 255));

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(maleRadioButton);
        buttonGroup.add(femaleRadioButton);

        frame.add(maleRadioButton);
        frame.add(femaleRadioButton);

        // Country
        JLabel countryLabel = new JLabel("Country:");
        countryLabel.setFont(labelFont);
        countryLabel.setBounds(80, 230, 100, 25);
        frame.add(countryLabel);

        String[] countries = {"Nepal", "India", "China", "Bhutan"};
        JComboBox<String> countryComboBox = new JComboBox<>(countries);
        countryComboBox.setBounds(200, 230, 250, 30);
        frame.add(countryComboBox);

        // Hobbies
        JLabel hobbyLabel = new JLabel("Hobbies:");
        hobbyLabel.setFont(labelFont);
        hobbyLabel.setBounds(80, 280, 100, 25);
        frame.add(hobbyLabel);

        JCheckBox music = new JCheckBox("Music");
        music.setBounds(200, 280, 80, 25);
        music.setBackground(new Color(245, 248, 255));
        frame.add(music);

        JCheckBox sports = new JCheckBox("Sports");
        sports.setBounds(290, 280, 80, 25);
        sports.setBackground(new Color(245, 248, 255));
        frame.add(sports);

        JCheckBox reading = new JCheckBox("Reading");
        reading.setBounds(380, 280, 90, 25);
        reading.setBackground(new Color(245, 248, 255));
        frame.add(reading);

        // Skills
        JLabel skillLabel = new JLabel("Skills:");
        skillLabel.setFont(labelFont);
        skillLabel.setBounds(80, 330, 100, 25);
        frame.add(skillLabel);

        String[] skills = {"Java", "Python", "C#", "C"};

        JList<String> skillList = new JList<>(skills);
        skillList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JScrollPane scrollPane = new JScrollPane(skillList);
        scrollPane.setBounds(200, 330, 150, 80);
        frame.add(scrollPane);

        // Submit Button
        JButton registerButton = new JButton("Submit");
        registerButton.setBounds(230, 440, 120, 40);
        registerButton.setBackground(new Color(70, 130, 180));
        registerButton.setFocusPainted(false);
        frame.add(registerButton);

        //button action
        registerButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String gender = genderLabel.getText();
                });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}