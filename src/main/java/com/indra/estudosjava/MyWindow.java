package com.indra.estudosjava;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Minha Janela");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Olá, Mundo!");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 40));
        add(label, BorderLayout.CENTER);

        Box.Filler filler = new Box.Filler(new Dimension(0, 30), new Dimension(0, 30),
                new Dimension(Short.MAX_VALUE, 25));
        add(filler, BorderLayout.PAGE_END);

        JButton button = new JButton("Clique aqui");
        button.setHorizontalAlignment(JLabel.CENTER);
        button.setVerticalAlignment(JLabel.CENTER);
        button.setFont(new Font("Arial", Font.BOLD, 24));
        button.setPreferredSize(new Dimension(100, 50));
        add(button, BorderLayout.PAGE_END);

        setVisible(true);

    }

    public static void main(String[] args) {
        new MyWindow();
    }
}
