package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AGVSimulation extends JFrame {

    private static final long serialVersionUID = 1L;
    private int agvX = 150, agvY = 100; // Initial position of AGV

    public AGVSimulation() {
        setTitle("AGV Simulation");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        AGVPanel panel = new AGVPanel();
        add(panel);

        // Timer to move AGV
        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agvX += 10; // Move AGV along x-axis
                if (agvX > 300) {
                    agvX = 150; // Reset position after a certain point
                }
                panel.repaint();
            }
        });
        timer.start();

        setVisible(true);
    }

    public static void main(String[] args) {
        new AGVSimulation();
    }

    class AGVPanel extends JPanel {
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
}
