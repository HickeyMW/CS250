/*
 * 
 *  Matthew Hickey
 * 
 * 
 */
import java.awt.*;
import java.applet.*;

public class HappyFace extends Applet
{     
	
	int[] data = {10, 20, 35, 20, 15};
	
    public void paint(Graphics g)
    {         
    	int width = this.getWidth(), length = this.getHeight();
    	this.setSize(width, length);
	    Font f = new Font("Helvetica", Font.BOLD,20);
	    g.setFont(f);
	    g.drawString("My Pie Chart!", 50, 30);
	    int startAngle = 90;
	    g.setColor(Color.blue);
	    int arcAngle = (int)((data[0]/95f)*360f);
	    g.fillArc(100, 180, 150, 150, startAngle, arcAngle);
	    startAngle += arcAngle;
	    
	    g.setColor(Color.green);
	    arcAngle = (int)((data[1]/95f)*360f);
	    g.fillArc(100, 180, 150, 150, startAngle, arcAngle);
	    startAngle += arcAngle;
	    
	    g.setColor(Color.red);
	    arcAngle = (int)((data[2]/95f)*360f);
	    g.fillArc(100, 180, 150, 150, startAngle, arcAngle);
	    startAngle += arcAngle;
	    
	    g.setColor(Color.pink);
	    arcAngle = (int)((data[3]/95f)*360f);
	    g.fillArc(100, 180, 150, 150, startAngle, arcAngle);
	    startAngle += arcAngle;
	    
	    g.setColor(Color.orange);
	    arcAngle = (int)((data[4]/95f)*360f);
	    g.fillArc(100, 180, 150, 150, startAngle, arcAngle);
	    startAngle += arcAngle;
	    
	    
	    
	    /*g.drawOval(0, 0, width, length);
	    g.fillOval(90, 120, 50, 20);
	    g.fillOval(190, 120, 50, 20);
	    g.drawLine(165, 125, 165, 175);
	    g.setColor(Color.BLUE);
	    g.fillArc(110, 130, 95, 95, 0, -180);*/
	    
    }
    
    
}