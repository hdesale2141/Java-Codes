import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaAwt2{

public JavaAwt2(){

Frame frame=new Frame("Closing The Window...");
frame.setSize(400,300);
frame.setVisible(true);
frame.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e){
frame.dispose();
}
});
}
public static void main(String args[]){

JavaAwt2 obj=new JavaAwt2();
}
}