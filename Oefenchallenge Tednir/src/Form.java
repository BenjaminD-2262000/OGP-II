import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSpinner;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class Form extends AbstractView{
    private JPanel mForm;
    private JTextField mName;
    private JSpinner mAge;
    private JSpinner mXCord;
    private JSpinner mYCord;
    private TednirController mTedC;
    private JButton mEnterButton;

    public Form(Person model, FormController c, TednirController tedC){
        super(model, c);
        mTedC = tedC;

        mForm = new JPanel(new GridLayout(5, 1));
        mName =  new JTextField(12);
        SpinnerModel Age = new SpinnerNumberModel(0, 0, 99, 1);
        mAge = new JSpinner(Age);
        SpinnerModel X = new SpinnerNumberModel(0, 0, 250, 1);
        SpinnerModel Y = new SpinnerNumberModel(0, 0, 250, 1);

        mXCord = new JSpinner(X);
        mYCord = new JSpinner(Y);


        mForm.add(mName);
        mForm.add(mAge);
        mForm.add(mXCord);
        mForm.add(mYCord);
        //TO DO all the other buttons for info

        //Button to finish making account
        mEnterButton = new JButton("SIGN UP");
        mEnterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                //sets all the information entered
                ((FormController)getController()).setName(mName.getText());
                ((FormController)getController()).setAge((int)(mAge.getValue()));
                ((FormController)getController()).setXcord((int)(mXCord.getValue()));
                ((FormController)getController()).setYcord((int)(mYCord.getValue()));

                mTedC.addNewUser((Person)getModel());
            }
        });
        mForm.add(mEnterButton);

    }
    public JComponent getUI(){
        return mForm;
    }

    @Override
    public void update(Observable o, Object info) {    
        
    }
}