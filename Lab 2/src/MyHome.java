/*
 * 
 *  Matthew Hickey
 * 
 * 
 */
import java.awt.*;
import java.applet.*;

public class MyHome extends Applet
{     
    public void paint(Graphics g)
    {         
	    Font f = new Font("Helvetica", Font.BOLD,20);
	    g.setFont(f);
	    g.drawString("My Home!", 50, 30);
	    g.drawRect(45, 80, 100, 100);
	    
	    g.drawLine(35, 90, 100, 35);
	    g.drawLine(155, 90, 100, 35);
	    
    }
}