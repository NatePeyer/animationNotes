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
                    Color.WHITE,
                    Color.YELLOW
            };

    public Ball(int xIn, int yIn)
    {
        x = xIn;
        y = yIn;
        size = (int)(Math.random() * 50 + 20);
        color = randomColor();
        xSpeed = (int)(Math.random() * 50 + 1);
        ySpeed = (int)(Math.random() * 50 + 1);
    }

    public void draw(Graphics g2)
    {
        g2.setColor(color);
        g2.fillOval(x,y,size,size);
    }

    public void moveBalls(JPanel panel)
    {
        x += xSpeed;
        if(x > panel.getWidth() - size)
        {
            xSpeed *= -1;
            xSpeed += (int)(Math.random() * 3 - 1);
        }
        else if(x < 0)
        {
            xSpeed *= -1;
            xSpeed += (int)(Math.random() * 3 - 1);
        }
        y += ySpeed;
        if(y > panel.getHeight() - size)
        {
            ySpeed *= -1;
            ySpeed += (int)(Math.random() * 3 - 1);
        }
        else if(y < 0)
        {
            ySpeed *= -1;
            ySpeed += (int)(Math.random() * 3 - 1);
        }
    }
    private Color randomColor()
    {
        int ranNum = (int)(Math.random()*13);
        return colors[ranNum];
    }
}
