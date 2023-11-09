import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

public class CalculatorController extends AbstractController implements FocusListener, KeyListener {
    public CalculatorController(Observable model) {
        super(model);
    }

    public void addToEquation(String Symbol){
        ((CalculatorModel)getModel()).addToEquation(Symbol);
    }

    public void solveEquation(){
        ((CalculatorModel)getModel()).solveEquation();
    }

    public void focusGained(FocusEvent e){
    }
    
    public void focusLost(FocusEvent e){ 
    }
    
    public void keyPressed(KeyEvent e){

    }

public void
keyReleased(KeyEvent e){}

public void
keyTyped(KeyEvent e){}
}


