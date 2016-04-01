package ProgByDoing;



import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author Nafiu
 */
public class BoringTriangle extends Canvas{
    public void paint(Graphics g){
        g.setColor(new Color(250,100, 50));
        int []x = {200, 100, 300} ;
        int []y = {200, 400, 400} ;
        g.fillPolygon(x, y, 3);
    }
    public static void main(String []args){
        JFrame win = new JFrame("A BORING TRIANGLE");
        win.setSize(400, 600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new BoringTriangle());
        win.setVisible(true);
        win.setAlwaysOnTop(true);
    }
}
