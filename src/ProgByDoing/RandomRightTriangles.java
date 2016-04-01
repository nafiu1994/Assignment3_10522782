package ProgByDoing;




import java.util.Random;
import java.awt.*;
import javax.swing.JFrame;
/**
 *
 * @author Lawal Nafiu
 */
public class RandomRightTriangles extends Canvas {
    public void paint(Graphics g){
        Random rn = new Random();
        int [] x = new int[3];
        int [] y = new int[3];
        for(int i = 0; i < 500; i++)
        {
        x[0] = rn.nextInt(400);
        x[1] = x[0];
        x[2] = x[0] + 50;
        y[0] = rn.nextInt(500);
        y[1] = y[0] + 50;
        y[2] = y[0] + 50;
        Color color = new Color((x[0]+y[0]) % 255, (y[0]+x[0]) % 255, x[0] % 255);
        g.setColor(color);
        g.fillPolygon(x,y,3);
        }
    }
    public static void main(String [] args){
        JFrame win = new JFrame("Random Right Triangles");
        win.setSize(500,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setAlwaysOnTop(true);
        win.setLocation(300,100);
        win.add(new RandomRightTriangles());
        win.setVisible(true);
    }
}
