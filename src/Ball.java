import java.awt.*;

public class Ball {
    private int size;
    private Color color;
    private int speed;
    private int x;
    private int y;
    private Color[] colors = new Color[14];

    public Ball(int xIn, int yIn)
    {
        x = xIn;
        y = yIn;
        size = 10;
        color = Color.BLUE;
        speed = 5;
    }

    public void draw(Graphics g2)
    {
        g2.setColor(color);
        g2.fillOval(x,y,size,size);
    }

    private void randomColor()
    {
        for(int i = 0; i < colors.length; i++)
        {

        }
    }
}
