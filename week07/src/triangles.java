import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class triangles {
  private static final int LIMIT = 4;
  private static List<Color> colors;

  public static void mainDraw(Graphics graphics){
    int height = HEIGHT /2;
    int topX = WIDTH / 2;

    colors = new ArrayList<>();
    colors.add(Color.BLACK);
    colors.add(Color.GREEN);
    colors.add(Color.RED);
    colors.add(Color.BLUE);
    colors.add(Color.MAGENTA);

    // 1. Find the pattern

    drawTrianglesRecursively(graphics, height, topX, 0, 0);
    //drawTrianglesRecursively(graphics, height, topX, 5, 0);
  }

  public static void drawTrianglesRecursively(Graphics graphics, int height, int topX, int topY, int counter){
    if (counter > LIMIT){
      return;
    }

    int halfEdge = getHalfEdge(height);
    int rightX = topX +  halfEdge;
    int rightY = topY + height;
    int leftX = topX -  halfEdge;
    int leftY = topY + height;

    // 2. Code the pattern
    // Draw original triangle
    graphics.setColor(colors.get(counter));
    graphics.drawLine(topX, topY, rightX, rightY);
    graphics.drawLine(rightX, rightY, leftX, leftY);
    graphics.drawLine(leftX, leftY, topX, topY);

    // 3. Apply recursion
    // Draw half size triangles around
    drawTrianglesRecursively(graphics, height/2, topX + getHalfEdge(height), topY, counter+1);
    drawTrianglesRecursively(graphics, height/2, topX - getHalfEdge(height), topY, counter + 1);
    drawTrianglesRecursively(graphics, height/2, topX, topY + height, counter + 1);
  }

  public static int getHalfEdge(int height){
    return (int) Math.round(height *  Math.tan(Math.toRadians(30)));
  }

  //region Static code
  // Don't touch the code below
  static int WIDTH = 900;
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