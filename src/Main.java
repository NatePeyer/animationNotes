import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args)
    {
        //System.out.println("Hello world!");
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        MyPanel panel = new MyPanel();
        panel.setSize(500,500);
        panel.generateBalls();
        JLabel label = new JLabel("The Balls Are Bouncing", SwingConstants.CENTER);

        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);
    }
}