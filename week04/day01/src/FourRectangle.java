import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangle {

  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    // avoid code duplication.

    for (int i = 0; i < 4; i++) {
      graphics.setColor(getRandomColor());
      graphics.drawRect(getRandomValue(), getRandomValue(), getRandomSize(), getRandomSize());
    }
    //graphics.setColor(Color.CYAN);
    //graphics.drawRect(10, 10, 200, 250);
  }

  public static Color getRandomColor() {
    Random random = new Random();
    int maxValue = 256;
    return new Color(random.nextInt(maxValue), random.nextInt(maxValue), random.nextInt(maxValue));
  }

  public static int getRandomSize() {
    Random random = new Random();
    int maxValue = HEIGHT/2;
    return random.nextInt(maxValue);
  }

  public static int getRandomValue() {
    Random random = new Random();
    int maxValue = 150;
    return random.nextInt(maxValue);
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