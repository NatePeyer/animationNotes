import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel
{
    private Ball[] myBalls = new Ball[10];
//    private int size = 200;
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
      //g.setColor(Color.red);
//      g.fillOval(xloc,yloc,50,50);
      //g.fillOval(400,400,50,50);
      for(int i = 0; i < myBalls.length; i++)
      {
          myBalls[i].draw(g);
      }
      for(int i = 0; i < myBalls.length; i++)
      {
          myBalls[i].moveBalls(this, myBalls, g);
      }

/*      for(int i = 0 ; i < myBalls.length; i++)
      {
          double x1 = myBalls[i].getX() + myBalls[i].getRadius();
          double y1 = myBalls[i].getY() + myBalls[i].getRadius();  
          for(int j = i + 1; j < myBalls.length; j++)
          {
              double x2 = myBalls[j].getX() + myBalls[j].getRadius();
              double y2 = myBalls[j].getY() + myBalls[j].getRadius();  
            
              double distanceBetweenPoints = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
              distanceBetweenPoints = Math.abs(distanceBetweenPoints);
            
              if(distanceBetweenPoints <= myBalls[i].getRadius() + myBalls[j].getRadius())
              {
                  g.setColor(Color.BLACK);
                  g.drawLine((int)x1, (int)y1, (int)x2 , (int)y2);
                  repaint();
                  System.err.println("collision detected i = " + i + " j = " + j + " distance " + distanceBetweenPoints);
                  System.err.println("x1 " + x1 + " y1 " + y1 + " r1 " + myBalls[i].getRadius());
                  System.err.println("x2 " + x2 + " y2 " + y2 + " r2 " + myBalls[j].getRadius());
                  myBalls[i].bounceOff();
                  myBalls[j].bounceOff();
              }
          }
      }*/
      //g.drawString("hello world", 215,250);
//      xloc+= xVel;
//      yloc+= 2;
//
//      if(xloc > 450)
//      {
//          xVel = xVel * -1;
//      }
//      else if(xloc < 0)
//      {
//          xVel = xVel * -1;
//      }
//      if(yloc > (getHeight() -100))
//      {
//          yVel *= -1;
//      }
//      if(yloc < 0)
//      {
//          yVel *= -1;
     // }

      // code for track on screen
//      g.setColor(Color.BLACK);
//      g.fillOval(215, 250, 200, 100);
//      g.setColor(Color.darkGray);
//      g.fillOval(220, 255, 190, 90);
//      g.setColor(Color.BLACK);
//      g.fillOval(225, 260, 180, 80);
//      g.setColor(Color.darkGray);
//      g.fillOval(230, 265, 170, 70);
//      g.setColor(Color.BLACK);
//      g.fillOval(235, 270, 160, 60);
//      g.setColor(Color.darkGray);
//      g.fillOval(240, 275, 150, 50);
//      g.setColor(Color.GREEN);
//      g.fillOval(245, 280, 140, 40);
//      g.setColor(Color.WHITE);
//      g.fillRoundRect(260, 290, 110, 20, 10, 10);
//      g.setColor(Color.green);
//      g.fillRoundRect(265, 295, 100, 10, 5, 5);

      //delay
      try
      {
          Thread.sleep(50);
      }
      catch (InterruptedException e)
      {
          System.out.println(e);
      }


      //calls paint component again
      repaint();

  }
}
