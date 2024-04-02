import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

   public class JavaAwt3
    {

      public JavaAwt3()
       {
       Frame frame=new Frame("Button Window....");
       Button button=new Button("Click Me");

       button.setBounds(20,40,80,30);
       frame.add(button);
       frame.setSize(400,300);
       frame.setLayout(null);
       frame.setVisible(true);
       
       frame.addWindowListener(new WindowAdapter()
        {
         public void windowClosing(WindowEvent e)
          {
           frame.dispose();
          }
        });
        }
   public static void main(String args[])
    {
     JavaAwt3 obj=new JavaAwt3();
    }
   }


