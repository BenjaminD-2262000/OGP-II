import javax.swing.BoxLayout;
import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App {        
    // form to fill in al the information upon 
    private TednirView mTednirView;
    //all the information about the user
    private Tednir mTednir;

    public App(){
        mTednir = new Tednir();
        TednirController c = new TednirController(mTednir);

        mTednirView = new TednirView(mTednir, c);
    }

    public void createGUI(){
        JFrame frame = new JFrame("Clock");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.getContentPane().add(mTednirView.getUI());
               
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.pack();
        frame.setVisible(true); 
    }

    public static void createAndShowGUI(){
        App T = new App();
        T.createGUI();
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
