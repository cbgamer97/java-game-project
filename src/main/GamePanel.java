package main;

import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel {
    // SCREEN SETTINGS
    final int originalTileSize = 16; //16x16 tile

    // SIZE SCALER FOR HIGH RES MONITORS
    final int scale = 3;

    final int tileSize = originalTileSize * scale; // 48x48 TILE
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol; // 768 PIXELS
    final int screenHeight = tileSize * maxScreenRow; // 576 PIXELS

    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }
}
