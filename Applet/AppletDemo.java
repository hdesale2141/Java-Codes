//import javax.swing.*;
import java.awt.*;
import java.applet.*;

public class AppletDemo extends Applet
{
	Choice ch=new Choice();
	public void init()
	{
	
	ch.addItem("C");
	ch.addItem("C++");
	ch.addItem("Java");
	ch.addItem("Python");
	add(ch);
	}
public static void main(String args[])
{
 AppletDemo obj=new AppletDemo();
}
}

// <html>
// <head>
// <title>
// Welcome to Java Applet
// </title>
// </head>
// <body>
// <applet code ="AppletDemo.class"width="800"height="500">
// </applet>
// </body>
// </html>