import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel
{
    private Ball[] myBalls = new Ball[20];
  public MyPanel()
  {
  }

  public void generateBalls()
  {
    
    setBackground(Color.white);
    for(int i = 0; i < myBalls.length; i++)
    {
        myBalls[i] = new Ball(this);
    }
  }

  @Override
  public void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      for(int i = 0; i < myBalls.length; i++)
      {
          myBalls[i].draw(g);
      }
      for(int i = 0; i < myBalls.length; i++)
      {
          myBalls[i].moveBalls(this, myBalls, g);
      }
  
      //delay
      try
      {
          Thread.sleep(25);
      }
      catch (InterruptedException e)
      {
          System.out.println(e);
      }


      //calls paint component again
      repaint();

  }
}
