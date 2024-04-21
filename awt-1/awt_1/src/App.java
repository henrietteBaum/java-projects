import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App {
    public static void main(String[] args) throws Exception {
        Frame frame = new Frame("AWT First");
        Label label = new Label("My awt label");

        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
              System.exit(0);
            }
          });
    

        frame.add(label);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
