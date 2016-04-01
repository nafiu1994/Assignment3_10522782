package ProgByDoing;




import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;

/**
 *
 * @author Lawal Nafiu
 */
public class RandomTriangles extends Canvas{
    public void paint (Graphics g){
        int []x = new int[3];
        int []y = new int[3];
        // Random number generator
        Random rn = new Random();
        for(int i = 0; i < 500; i++)
        {
        x[0] = rn.nextInt(200);
        x[1] = rn.nextInt(400);
        x[2] = rn.nextInt(500);
        y[0] = rn.nextInt(200);
        y[1] = rn.nextInt(400);
        y[2] = rn.nextInt(600);
        Color color = new Color(x[0] % 255, y[0] % 255, x[2] % 255);
        g.setColor(color);
        g.fillPolygon(x,y,3);
        }
    }
    public static void main(String[] args){
        JFrame win = new JFrame("Random Triangles");
        win.setSize(500,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setAlwaysOnTop(true);
        win.setLocation(300,100);
        win.add(new RandomTriangles());
        win.setVisible(true);
    }
}
