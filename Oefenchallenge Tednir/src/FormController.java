
public class FormController extends AbstractController {

    public FormController(Person model){
        super(model);
    }

    public void setName(String name){
        ((Person)getModel()).setName(name);
    }

    public void setAge(int age){
        ((Person)getModel()).setAge(age);
    }

    public void setXcord(int X){
        ((Person)getModel()).setXcord(X);
    }

    public void setYcord(int Y){
        ((Person)getModel()).setYcord(Y);
    }



}
