import java.awt.*;
import java.applet.*;
import javax.swing.*;

public class Apdemo extends JApplet{
 public void init(){
  JComboBox ch=new JComboBox();
  ch.addItem("C");
  ch.addItem("C++");
  ch.addItem("Python");
  ch.addItem("Java");
  add(ch);
  //Container cnt=getContentPane();
  //cnt.add(ch);
  //setContentPane(cnt);

}


}