import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import java.util.ArrayList;

public class CalculatorView extends AbstractView{
    ArrayList<JButton> m_numbers = new ArrayList<JButton>();
    JPanel m_numberGrid;
    JPanel m_OperandsGrid;
    JPanel m_inputPanel;
    JButton m_plus;
    JButton m_minus;
    JButton m_equals;

    public CalculatorView(Observable model, CalculatorController controller){
        super(model, controller);
        init();
    }

    private void init(){
        initNums();
        initOperands();
        m_inputPanel = new JPanel(new GridLayout(1, 2));
        m_inputPanel.add(m_OperandsGrid);
        m_inputPanel.add(m_numberGrid);
    }

    private void initNums(){
        m_numberGrid = new JPanel(new GridLayout(4, 3));
        for (Integer i = 0; i < 10; ++i){
            JButton numb = new JButton(i.toString());
            
            numb.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    ((CalculatorController)getController()).addToEquation(numb.getText());
                }
            });
            m_numbers.add(numb);
            m_numberGrid.add(numb);

        }
    }
    private void initOperands(){
        m_OperandsGrid = new JPanel(new GridLayout(3, 1));
        m_plus = new JButton("+");
        m_plus.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    ((CalculatorController)getController()).addToEquation(m_plus.getText());
                }
        });
        m_OperandsGrid.add(m_plus);
        m_minus = new JButton("-");
        m_minus.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    ((CalculatorController)getController()).addToEquation(m_minus.getText());
                }
        });
        m_OperandsGrid.add(m_minus);

        m_OperandsGrid.add(m_plus);
        m_equals = new JButton("=");
        m_equals.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    ((CalculatorController)getController()).solveEquation();
                }
        });
        m_OperandsGrid.add(m_equals);
    }

    public JComponent getUI(){
        return m_inputPanel;
    }
}
