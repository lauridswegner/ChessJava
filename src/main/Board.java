package main;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    public int tileSize = 85;

    int cols = 8;
    int rows = 8;
    public Board() {
        this.setPreferredSize(new Dimension(cols * tileSize, rows * tileSize));
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++) {
                g2d.setColor((c+r)%2==0 ? new Color(7, 47, 124): new Color(93, 114, 176));
                g2d.fillRect(c * tileSize, r * tileSize, tileSize, tileSize);
            }
    }

}