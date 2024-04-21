import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Swing-First");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("First GUI-Demo with Swing");
        frame.add(label);

        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
