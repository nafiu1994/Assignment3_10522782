package ProgByDoing;



import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;
/**
 *
 * @author Lawal Nafiu
 */
public class ForestAndTrees extends Canvas {
    public void paint(Graphics g) {
        drawTree(g, 30, 550);
        drawTree(g, 100, 580);
        drawTree(g, 640, 300);
        drawTree(g, 730, 370);
        
        g.drawRect(10, 10, 500, 500);
        drawForest(g, 10, 10, 500, 500);
        
        g.drawRect(550, 20, 400, 250);
        drawForest(g, 550, 20, 400, 250);
        
        g.drawRect(200, 530, 710, 160);
        drawForest(g, 200, 530, 710, 160);
    }
    
    public void drawTree(Graphics g, int x, int y){
        g.setColor(new Color(134, 83, 0));
        g.fillRect(x + 17, y + 50, 16, 50);
        int [] x1 = new int[3];
        int [] y1 = new int[3];
        x1[0] = x + 25;
        x1[1] = x + 50;
        x1[2] = x;
        y1[0] = y;
        y1[1] = y + 75;
        y1[2] = y + 75;
        g.setColor(Color.GREEN);
        g.fillPolygon(x1, y1, 3);
    }
    public void drawForest(Graphics g,int x, int y, int w,int h){
        g.setColor(Color.black);
        g.drawRect(x, y, w, h);
        Random rn = new Random();
        for(int i = 0; i < 100; i++)
        {
            int a = 0, b = 0;
            a = rn.nextInt(w-50);
            b = rn.nextInt(h -100);
            
            drawTree(g, x+a, y+b);
        }
    }
    public static void main(String[] args) {
        JFrame win = new JFrame("A Smiling Face Function");
        win.setSize(1024, 768);
        win.setAlwaysOnTop(true);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new ForestAndTrees());
        win.setVisible(true);
    }
    
}
