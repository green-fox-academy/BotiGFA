import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class circles {
  public static void mainDraw(Graphics graphics) {
    int xCenter = WIDTH / 2;
    int yCenter = HEIGHT / 2;
    int size = WIDTH / 2;
    int height = (int) ((Math.sqrt(3) / 2) * size );
    drawCircleFromCenter(graphics, xCenter, yCenter, size);

    drawCircleFromCenter(graphics, xCenter, yCenter / 2, size / 2);
    drawCircleFromCenter(graphics, xCenter - getHalfEdge(height), yCenter / 2 + height, size / 2);
    drawCircleFromCenter(graphics, xCenter + getHalfEdge(height), yCenter / 2 + height, size / 2);
  }

  public static void drawCirclesRecursively(Graphics graphics, int x, int y, int size) {
    drawCircleFromCenter(graphics, x, y, size);
  }

  public static void drawCircleFromCenter(Graphics graphics, int xCenter, int yCenter, int r) {
    graphics.drawOval(xCenter - r, yCenter - r, 2*r, 2*r);
  }

  public static int getHalfEdge(int height) {
    return (int) Math.round(height * Math.tan(Math.toRadians(30)));
  }

  //region static code
  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

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
  //endregion
}