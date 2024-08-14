package br.com.cod3r.composite.swing;

import javax.swing.*;
import java.awt.*;

public class Client {

    public static void main(String[] args) {
        // JLabel, JButton, JPanel, JFrame all inherit
        // from Container
        // A Container has a list of components that can be added
        // using the add method

        JLabel title = new JLabel("TITLE");
        JLabel label = new JLabel("Label #1");
        JButton button = new JButton("Button #1");

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(label);
        panel.add(button);

        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.add(title, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
