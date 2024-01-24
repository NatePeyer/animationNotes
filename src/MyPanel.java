import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel
{
  public MyPanel()
  {
      setBackground(Color.white);
  }

  @Override
  public void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      g.setColor(Color.red);
      g.fillOval(50,50,50,50);
      g.fillOval(400,400,50,50);
      g.drawString("hello world", 215,250);

      // code for track on screen
      g.setColor(Color.BLACK);
      g.fillOval(215, 250, 200, 100);
      g.setColor(Color.darkGray);
      g.fillOval(220, 255, 190, 90);
      g.setColor(Color.BLACK);
      g.fillOval(225, 260, 180, 80);
      g.setColor(Color.darkGray);
      g.fillOval(230, 265, 170, 70);
      g.setColor(Color.BLACK);
      g.fillOval(235, 270, 160, 60);
      g.setColor(Color.darkGray);
      g.fillOval(240, 275, 150, 50);
      g.setColor(Color.GREEN);
      g.fillOval(245, 280, 140, 40);
      g.setColor(Color.WHITE);
      g.fillRoundRect(260, 290, 110, 20, 10, 10);
      g.setColor(Color.green);
      g.fillRoundRect(265, 295, 100, 10, 5, 5);

  }
}
