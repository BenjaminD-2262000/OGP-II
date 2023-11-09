import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TednirView extends AbstractView{
    JButton mFormButton;
    JButton mNewSuggestion;
    JLabel mUsername;
    JPanel mTednirPanel;
    JPanel mSuggestion;
    JLabel mSuggestionName;



    TednirView(Tednir model, TednirController c){
        super(model, c);
        init();
        initSuggestion();
        
    }

    private void init(){
        mTednirPanel = new JPanel(new GridLayout(5, 1));
        mUsername = new JLabel("User: ");

        mFormButton = new JButton("New User");
        mFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                ((TednirController)getController()).newUser();
            }
        });

        mTednirPanel.add(mUsername);
        mTednirPanel.add(mFormButton);
    }

    private void initSuggestion(){
        mSuggestion = new JPanel(new GridLayout(5, 1));
        mSuggestionName = new JLabel("Name: ");
        mNewSuggestion = new JButton("next");


        mNewSuggestion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                ((TednirController)getController()).newSuggestion();
            }
        });
        mSuggestion.add(mSuggestionName);
        mSuggestion.add(mNewSuggestion);
        mTednirPanel.add(mSuggestion);
    }

    public JComponent getUI(){
        return mTednirPanel;
    }

    @Override
    public void update(Observable o, Object info) {    
        // Cast info to ClockUpdate type.
        if (info instanceof String){
            mUsername.setText("User: " + info);
            return;
        }
        
        Person userInfo = (Person)info;
        mSuggestionName.setText("User: " + userInfo.getName());

        
    }


}
