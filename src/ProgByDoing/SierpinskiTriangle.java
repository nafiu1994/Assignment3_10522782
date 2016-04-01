package ProgByDoing;

import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author Lawal Nafiu
 */
public class SierpinskiTriangle extends Canvas{
    public void paint(Graphics g){
        Random rn = new Random();
        int [] x1 = {512, 146, 876};
        int [] y1 = {109, 654, 654};
        int dx = 0, px = 0, x = 512;
        int dy = 0, py = 0, y = 382;
        int rand = 1;
        g.drawPolygon(x1, y1, 3);
        for (int i = 0; i < 50000; i++)
        {
            rand = rn.nextInt(10) % 3;
            /*try{
                Thread.sleep(10);
            }catch(Exception ep){
                System.out.println("Sleep didn't work");
            }
            System.out.println("Case not found" + rand);*/
            switch (rand + 1)
            {
                case 1:
                    dx = x - x1[0];
                    dy = x - y1[0];
                    px = x;
                    py = y;
                    x -= dx;
                    y -= dy;
                    break;
                case 2:
                    dx = x - x1[1];
                    dy = x - y1[1];
                    px = x;
                    py = y;
                    x -= dx;
                    y -= dy;
                    break;
                case 3:
                    dx = x - x1[2];
                    dy = x - y1[2];
                    px = x;
                    py = y;
                    x -= dx;
                    y -= dy;
                    /*= x - dx / 2;
                    y = y - dy / 2;*/
                    break;
                default:
                    System.out.println("Case not found" + rand);
                    break;
            }
            g.drawLine(x, y,px, py);
        }
        
        
    }
    // The start of the program.
    public static void main(String [] args){
        JFrame win = new JFrame("Sierpinski Triangle");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new SierpinskiTriangle());
        win.setVisible(true);
    }
}
