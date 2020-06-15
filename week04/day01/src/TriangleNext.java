import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TriangleNext {
  public static void mainDraw(Graphics graphics) {
    int size = 20;
    int piecesOfTriangle = 21;
    int xChange = 20;
    int yChange = triangleAltitude(size);
    int[] xCoordinates = {WIDTH - WIDTH, size / 2, size};
    int[] yCoordinates = {HEIGHT, (HEIGHT - triangleAltitude(size)), HEIGHT};
    for (int i = 1; i < 22; i++) {
      for (int j = 0; j < piecesOfTriangle; j++) {
        graphics.drawPolygon(xCoordinates, yCoordinates, xCoordinates.length);
        for (int k = 0; k < xCoordinates.length; k++) {
          xCoordinates[k] += size;
        }
      }
      piecesOfTriangle--;
      int slide = i * (size/2);

      xCoordinates[0] = slide;
      xCoordinates[1] = size / 2 + slide;
      xCoordinates[2] = size + slide;

      yCoordinates[0] -= triangleAltitude(size);
      yCoordinates[1] -= triangleAltitude(size);
      yCoordinates[2] -= triangleAltitude(size);
    }
  }


  public static int triangleAltitude(int size) {
    return (int) ((Math.sqrt(3) / 2) * size);
  }


  // Don't touch the code below
  static int WIDTH = 420;
  static int HEIGHT = 620;

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