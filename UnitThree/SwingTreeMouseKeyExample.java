package UnitThree;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SwingTreeMouseKeyExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Tree and Events Demo");
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        // TREE SECTION

        DefaultMutableTreeNode root =
                new DefaultMutableTreeNode("Java Programming");

        DefaultMutableTreeNode java =
                new DefaultMutableTreeNode("Java");
        java.add(new DefaultMutableTreeNode("Swing"));
        java.add(new DefaultMutableTreeNode("JDBC"));
        java.add(new DefaultMutableTreeNode("Collections"));

        DefaultMutableTreeNode web =
                new DefaultMutableTreeNode("Web");
        web.add(new DefaultMutableTreeNode("HTML"));
        web.add(new DefaultMutableTreeNode("CSS"));
        web.add(new DefaultMutableTreeNode("JavaScript"));

        DefaultMutableTreeNode database =
                new DefaultMutableTreeNode("Database");
        database.add(new DefaultMutableTreeNode("MySQL"));
        database.add(new DefaultMutableTreeNode("Oracle"));

        root.add(java);
        root.add(web);
        root.add(database);

        JTree tree = new JTree(root);

        JScrollPane treeScroll = new JScrollPane(tree);
        treeScroll.setPreferredSize(new Dimension(220, 0));

        // CENTER PANEL

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(240, 248, 255));

//        JLabel title = new JLabel("Tree, Mouse and Keyboard Events");
//        title.setFont(new Font("Arial", Font.BOLD, 18));
//        title.setBounds(50, 20, 350, 30);
//        panel.add(title);

        JLabel label = new JLabel("Click, Type or Select a Tree Node");
        label.setBounds(50, 70, 400, 30);
        panel.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(50, 120, 300, 35);
        panel.add(textField);

        JButton button = new JButton("Show Text");
        button.setBounds(50, 180, 150, 40);
        panel.add(button);

        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);

        JScrollPane outputScroll =
                new JScrollPane(outputArea);
        outputScroll.setBounds(50, 250, 350, 150);
        panel.add(outputScroll);

        // TREE EVENT

        tree.addTreeSelectionListener(e -> {
            TreePath path = e.getPath();

            label.setText("Selected: " +
                    path.getLastPathComponent());

            outputArea.append(
                    "Tree Node Selected: "
                            + path.getLastPathComponent()
                            + "\n");
        });

        // MOUSE EVENTS

        panel.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText(
                        "Mouse Clicked at ("
                                + e.getX()
                                + ", "
                                + e.getY()
                                + ")"
                );
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel.setBackground(
                        new Color(220, 255, 220));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel.setBackground(
                        new Color(240, 248, 255));
            }
        });

        // KEYBOARD EVENTS

        textField.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {
                label.setText(
                        "Typing: " +
                                textField.getText());
            }

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode()
                        == KeyEvent.VK_ENTER) {

                    outputArea.append(
                            "Entered: "
                                    + textField.getText()
                                    + "\n");

                    label.setText(
                            "Enter Pressed: "
                                    + textField.getText());
                }
            }
        });

        // BUTTON EVENT

        button.addActionListener(e -> {

            String text = textField.getText();

            if (text.isEmpty()) {
                JOptionPane.showMessageDialog(
                        frame,
                        "Please enter some text."
                );
            } else {
                outputArea.append(
                        "Button Clicked: "
                                + text
                                + "\n");

                JOptionPane.showMessageDialog(
                        frame,
                        "You entered: " + text
                );
            }
        });

        // ADD COMPONENTS

        frame.add(treeScroll, BorderLayout.WEST);
        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}