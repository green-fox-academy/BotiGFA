

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics g) {
    // Reproduce this: https://github.com/green-fox-academy/teaching-materials/blob/master/project/drawing/r1.png

    for (int i = 20; i < HEIGHT; i += 20) {
      drawLines(WIDTH - i, 0, WIDTH, HEIGHT - i, g);
    }


  }
  public static void drawLines(int x1, int y1, int x2, int y2, Graphics graphics) {
    graphics.setColor(Color.magenta);
    graphics.drawLine(x1, y1, x2, y2);
  }
  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    Diagonals.ImagePanel panel = new Diagonals.ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
