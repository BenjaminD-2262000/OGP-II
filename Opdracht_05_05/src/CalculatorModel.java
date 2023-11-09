import java.util.Observable;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class CalculatorModel extends Observable{
    String m_equation = "";

    public void addToEquation(String symbol){
        m_equation = m_equation.concat(symbol); 

        CalculatorUpdate info = new CalculatorUpdate(m_equation);
        setChanged();
        notifyObservers(info);
    }

    public void solveEquation(){
        ScriptEngineManager mgr = new ScriptEngineManager(null);
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        try {
        Object result = engine.eval(m_equation);
        m_equation = result.toString();
        } catch (ScriptException e){}

        CalculatorUpdate info = new CalculatorUpdate(m_equation);
        setChanged();
        notifyObservers(info);
    }
}

