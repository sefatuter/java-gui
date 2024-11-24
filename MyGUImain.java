import javax.swing.JFrame;

public class MyGUImain {
    public static void main(String[] args) {
        MyGUI myGUI = new MyGUI();
        myGUI.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        myGUI.setSize( 275, 180 );
        myGUI.setVisible( true );
    }
}
