package ProgByDoing;



import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author Lawal Nafiu
 */
public class MotivationalPoster extends Canvas{
    	Image coolFace;
	
	public MotivationalPoster() throws Exception
	{
		coolFace = ImageIO.read( new File("mitch_2.png") );
		// Java supports PNG, JPEG, and GIF (but not animated GIFs). It does not support BMP.
	}
	
	public void paint( Graphics g )
	{
		//           Image  , x,  y, this
            g.setColor(Color.black);
            g.fillRect(0,0, this.getWidth(), this.getHeight());
            g.drawImage(coolFace,80,20,this);
		
		// And, just for fun, let's give me a halo! This halo designed by Liz O in 2012.
            g.setColor(Color.red);
            g.setFont(new Font("Georgia", Font.BOLD, 98));
            g.drawString("M", 75, 500);
            g.drawString("L", 565, 500);
            g.setFont(new Font("Georgia", Font.BOLD, 60));
            g.drawString("R. MITCHEL ", 175, 475);
            g.drawLine(175, 478, 565, 478);
            g.setColor(Color.white);
            g.setFont(new Font("Sans-Serif", Font.BOLD, 28));
            g.drawString("NOT A CYBORG. PROBABLY.", 175, 550);
                
	}

	public static void main(String[] args) throws Exception
	{
		JFrame win = new JFrame("Image Demo");
		win.setSize(720,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new MotivationalPoster() );
		win.setVisible(true);
	}
}
