package com.indra.estudosjava;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ScreenResolution {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        System.out.println("A resoluçao da tela é " + width + "x" + height);
    }
}
