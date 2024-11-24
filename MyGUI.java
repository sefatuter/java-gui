import javax.swing.*;
import java.awt.*;

public class MyGUI extends JFrame {

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    public MyGUI() {
        super("Test");
        setLayout(new FlowLayout());

        label1 = new JLabel("Hello World");
        label1.setToolTipText("This is label1");
        add(label1);

        Icon bug = new ImageIcon(getClass().getResource("cat.png"));
        label2 = new JLabel("Label with icon");
        add(label2);
    }
}
