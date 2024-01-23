import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel
{
  public MyPanel()
  {
      setBackground(Color.GREEN);
  }

  @Override
  public void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      g.setColor(Color.red);
      g.fillOval(50,50,50,50);
      g.fillOval(400,400,50,50);
      g.drawString("hello world", 215,250);
  }
}
