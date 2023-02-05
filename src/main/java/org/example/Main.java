package org.example;

import java.awt.*;
import javax.swing.*;

class SnakeGame extends JFrame {
    private int x = 10, y = 10, size = 20;
    private int[] xCoords = new int[100], yCoords = new int[100];
    private int dots = 0;

    public SnakeGame() {
        setTitle("Snake Game");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 300, 300);
        g.setColor(Color.GREEN);
        for (int i = 0; i < dots; i++) {
            g.fillRect(xCoords[i], yCoords[i], size, size);
        }
    }

    public static void main(String[] args) {
        new SnakeGame();
    }
}
