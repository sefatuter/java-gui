import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUI extends JFrame {

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public MyGUI() {
        super("Test");
        setLayout(new FlowLayout());

        label1 = new JLabel("Hello World", SwingConstants.CENTER);
        label1.setToolTipText("This is label1");
        add(label1);

        //Icon ico = new ImageIcon("squ.png");
        //label2 = new JLabel("Label with icon", ico, JLabel.CENTER);
        //add(label2);

        textField1 = new JTextField(10);
        add(textField1);

        textField2 = new JTextField("Enter text here");
        add(textField2);

        textField3 = new JTextField("Uneditable text field",21);
        textField3.setEditable(false);
        add(textField3);

        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener( handler );
        textField2.addActionListener( handler );
        textField3.addActionListener( handler );

    }

    private class TextFieldHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String string = "";

            if (e.getSource() == textField1) {
                string = String.format("textField1: %s", e.getActionCommand());
            }
            else if (e.getSource() == textField2) {
                string = String.format("textField2: %s", e.getActionCommand());
            }
            else if (e.getSource() == textField3) {
                string = String.format("textField3: %s", e.getActionCommand());
            }
            JOptionPane.showMessageDialog(null, string);
        }
    }
}
