import java.util.Observable;

import javax.swing.JComponent;
import javax.swing.JTextField;

public class CalculatorScreen extends AbstractView{
    private JTextField m_screen;

    public CalculatorScreen(Observable model, Controller controller) {
        super(model, controller);
        init();

    }
        
    private void init() {
    m_screen = new JTextField();
    m_screen.addFocusListener((CalculatorController)getController());
    m_screen.addKeyListener((CalculatorController)getController());
    }
    
    @Override
    public void update(Observable o, Object info) {    
        CalculatorUpdate calcInfo = (CalculatorUpdate) info;
        
        String equation = calcInfo.getEquation();

        m_screen.setText(equation);

    }

    public JComponent getUI(){
        return m_screen;
    }
}
