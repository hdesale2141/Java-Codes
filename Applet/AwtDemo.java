//import javax.swing.*;
import java.awt.*;

class AwtDemo extends Frame
{
 AwtDemo()
{
 setTitle("Awt Demo..");
 setSize(400,400);
 Choice ch=new Choice();
 ch.addItem("Dhule");
 ch.addItem("NAshik");
 ch.addItem("PunE"); 
 ch.addItem("Mumbai");

}
public static void main(String args[])
{
 AwtDemo obj=new AwtDemo();
}
}