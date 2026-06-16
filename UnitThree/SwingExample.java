package UnitThree;

import javax.swing.*;

public class SwingExample {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setTitle("my application");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);


        JLabel label = new JLabel("Hello");

        frame.add(label);
        frame.setVisible(true);

    }
}
