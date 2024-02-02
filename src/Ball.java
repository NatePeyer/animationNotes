import javax.swing.*;
import java.awt.*;

public class Ball {
    private int size;
    private Color color;
    private int xSpeed;
    private int ySpeed;
    private int x;
    private int y;
    private Color[] colors =
            {
                    Color.BLACK,
                    Color.BLUE,
                    Color.CYAN,
                    Color.DARK_GRAY,
                    Color.GRAY,
                    Color.GREEN,
                    Color.LIGHT_GRAY,
                    Color.MAGENTA,
                    Color.ORANGE,
                    Color.PINK,
                    Color.RED,
                    Color.YELLOW
            };

    public Ball(JPanel panel)
    {
        size = (int)(Math.random() * 50 + 20);
        x = (int)(Math.random() * (panel.getWidth() - size));
        y = (int)(Math.random() * (panel.getHeight() - size));
        System.out.println(panel.getWidth());
        System.out.println(panel.getHeight());
        System.out.println(x);
        System.out.println(y);
        color = randomColor();
        xSpeed = (int)(Math.random() * 50 + 1);
        ySpeed = (int)(Math.random() * 50 + 1);
    }

    public void draw(Graphics g2)
    {
        g2.setColor(color);
        g2.fillOval(x,y,size,size);
    }

    public void moveBalls(JPanel panel, Ball[] myBalls, Graphics g)
    {
        x += xSpeed;
        if(x > panel.getWidth() - size)
        {
            x = panel.getWidth() - size;
            xSpeed *= -1;
            xSpeed += (int)(Math.random() * 3 - 1);
        }
        else if(x < 0)
        {
            x = 0;
            xSpeed *= -1;
            xSpeed += (int)(Math.random() * 3 - 1);
        }
        y += ySpeed;
        if(y > panel.getHeight() - size)
        {
            y = panel.getHeight() - size;
            ySpeed *= -1;
            ySpeed += (int)(Math.random() * 3 - 1);
        }
        else if(y < 0)
        {
            y = 0;
            ySpeed *= -1;
            ySpeed += (int)(Math.random() * 3 - 1);
        }
        for(int i = 0 ; i < myBalls.length; i++)
        {
            double x1 = myBalls[i].getX() + myBalls[i].getRadius();
            double y1 = myBalls[i].getY() + myBalls[i].getRadius();
            for(int j = i + 1; j < myBalls.length; j++)
            {
                double x2 = myBalls[j].getX() + myBalls[j].getRadius();
                double y2 = myBalls[j].getY() + myBalls[j].getRadius();

                double distanceBetweenPoints = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                distanceBetweenPoints = Math.abs(distanceBetweenPoints);

                if(distanceBetweenPoints <= myBalls[i].getRadius() + myBalls[j].getRadius() + .5)
                {
                    g.setColor(Color.BLACK);
                    g.drawLine((int)x1, (int)y1, (int)x2 , (int)y2);
                    System.err.println("collision detected i = " + i + " j = " + j + " distance " + distanceBetweenPoints);
                    System.err.println("x1 " + x1 + " y1 " + y1 + " r1 " + myBalls[i].getRadius());
                    System.err.println("x2 " + x2 + " y2 " + y2 + " r2 " + myBalls[j].getRadius());
                    myBalls[i].bounceOff();
                    myBalls[j].bounceOff();
                }
            }
        }
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
    public void bounceOff()
    {
        x = x - xSpeed;
        xSpeed *= -1;
        xSpeed += (int)(Math.random() * 3 - 1);
        y = y - ySpeed;
        ySpeed *= -1;
        ySpeed += (int)(Math.random() * 3 - 1);
    }
    public double getRadius()
    {
        return size/2;
    }
    private Color randomColor()
    {
        int ranNum = (int)(Math.random()*12);
        return colors[ranNum];
    }
}
