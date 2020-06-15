import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r3.png]
    int x = 0;
    int y = 0;
    int sideLength = WIDTH / 8;
    int modulo = WIDTH / 4;

    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (x % modulo == 0 && y % modulo == 0) {
          drawBox(x, y, sideLength, graphics);
        }
        else if (x % modulo == 40 && y % modulo == 40) {
          drawBox(x, y, sideLength, graphics);
        }
        x = x + sideLength;
      }
      y = y + sideLength;
      x = x - WIDTH;
    }
  }

  public static void drawBox (int x, int y, int size, Graphics g) {
    g.setColor(Color.BLACK);
    g.fillRect(x, y, size, size);
    g.setColor(new Color(143, 0, 255));
    g.drawRect(x, y, size, size);

  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
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