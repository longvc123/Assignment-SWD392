package main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class AGVPanel extends JPanel {
    private int agvX = 150, agvY = 100; // Initial position of AGV

	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawMap(g);
        drawAGV(g);
    }

    private void drawMap(Graphics g) {
        // Set up colors
        g.setColor(Color.ORANGE);
        // Draw paths
        g.drawLine(100, 100, 300, 100);
        g.drawLine(300, 100, 300, 300);
        g.drawLine(300, 300, 100, 300);
        g.drawLine(100, 300, 100, 100);

        // Draw locations and packages
        g.setColor(Color.GRAY);
        g.fillRect(300, 80, 60, 40);
        g.fillRect(100, 280, 60, 40);

        g.setColor(Color.BLACK);
        g.drawString("Location 1 & Package", 300, 75);
        g.drawString("Location 2 & Package", 100, 275);
    }

    private void drawAGV(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(agvX, agvY, 30, 30); // Draw AGV at updated position
    }
}
