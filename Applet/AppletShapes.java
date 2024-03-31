import java.awt.*;
import java.applet.*;

public class AppletShapes extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Hello",50,50);
		g.setColor(Color.red);
		g.drawRect(100,100,50,50);
		// g.fillRect(100,100,50,50);
		g.drawLine(100,100,300,300);
		g.setColor(Color.blue);
		g.fillArc(100, 100, 100, 100, 150, 50);
		
	}
}