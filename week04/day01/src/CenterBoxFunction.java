import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

  public static void mainDraw(Graphics graphics){
    // create a function that draws one square and takes 2 parameters:
    // the square size and the graphics
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.
    // avoid code duplication.

    drawBoxInTheCenter(graphics, getRandomCoordinates());
    drawBoxInTheCenter(graphics, 50);
    drawBoxInTheCenter(graphics, 60);


  }

  public static void  drawBoxInTheCenter(Graphics graphics, int sideLength){
    graphics.drawRect(WIDTH/2-sideLength/2, HEIGHT/2-sideLength/2, sideLength, sideLength);
  }
  public static int getRandomCoordinates() {
    Random random = new Random();
    int maxValue = HEIGHT;
    return random.nextInt(maxValue);
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;


  //region
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