import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JFrame;



public class TednirController extends AbstractController {
    JFrame mFormFrame;

    TednirController(Tednir model){
        super(model);
    }

    public void newUser(){
        Person user = new Person();
        FormController c = new FormController(user);
        Form form = new Form(user, c, this);
        createGUI(form);
    }

    public void createGUI(Form form){
        mFormFrame = new JFrame("Clock");
        mFormFrame.setLayout(new BoxLayout(mFormFrame.getContentPane(), BoxLayout.Y_AXIS));
        mFormFrame.getContentPane().add(form.getUI());
               
        
        mFormFrame.pack();
        mFormFrame.setVisible(true); 
    }

    public void newSuggestion(){
        ((Tednir)getModel()).newSuggestion();
    }

    
    //Adds the user to the UserDataBase and 
    public void addNewUser(Person user){
        mFormFrame.dispatchEvent(new WindowEvent(mFormFrame, WindowEvent.WINDOW_CLOSING));
        ((Tednir)getModel()).addNewUser(user);
    }

    public String getCurrentUserName(){
        return ((Tednir)getModel()).getCurrentUserName();
    }
}
