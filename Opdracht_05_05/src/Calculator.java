import java.time.Clock;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class Calculator {
    private CalculatorModel m_model;
    
    private CalculatorView m_view;
    private CalculatorScreen m_screen;
    
    
    public Calculator() {
        // Create the data model.
        m_model = new CalculatorModel();
        
        CalculatorController c = new CalculatorController(m_model);

        m_view = new CalculatorView(m_model, c);
        m_screen = new CalculatorScreen(m_model, c);
        m_model.addObserver(m_screen);
        m_model.addObserver(m_view);

    }
    
    public void createGUI() {
        JFrame frame = new JFrame("Clock");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.getContentPane().add(m_screen.getUI());
        frame.getContentPane().add(m_view.getUI());                
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.pack();
        frame.setVisible(true);
    }
    
    private static void createAndShowGUI() {
        Calculator calc = new Calculator();
        calc.createGUI();
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
