package ProgByDoing;

import java.awt.*;
import javax.swing.JFrame;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageDemo extends Canvas
{
	Image coolFace;
        Image myFace;
	
	public ImageDemo() throws Exception
	{
		coolFace = ImageIO.read( new File("mitch.png") );
                myFace = ImageIO.read(new File("me.png"));
		// Java supports PNG, JPEG, and GIF (but not animated GIFs). It does not support BMP.
	}
	
        @Override
	public void paint( Graphics g )
	{
		//           Image  , x,  y, this
		g.drawImage(coolFace,100,100,this);
                g.drawImage(myFace, 300, 100, 60, 80, this);
		
		// And, just for fun, let's give me a halo! This halo designed by Liz O in 2012.
		g.setColor( Color.yellow );
		g.drawOval(88,88,70,25);
		g.drawOval(288,88,70,25);
	}

	public static void main(String[] args) throws Exception
	{
		JFrame win = new JFrame("Image Demo");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new ImageDemo() );
		win.setVisible(true);
	}


}
