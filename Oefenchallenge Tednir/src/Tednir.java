import java.util.List;
import java.util.Observable;
import java.util.ArrayList;


public class Tednir extends Observable{
    List<Person> mUserDB;
    Person mCurrentUser;
    Person mSuggestion;
    Algorithm mAlgorithm;

    Tednir(){
        mUserDB = new ArrayList<>();
        mAlgorithm = new RandomAlgorithm(mCurrentUser, mUserDB);
        test();
    }

    public void addUser(Person user){
        mUserDB.add(user);
    }

    public void setCurrentUser(Person user){
        mCurrentUser = user;
        setChanged();
        notifyObservers(mCurrentUser.getName());
    }

    public String getCurrentUserName(){
        return mCurrentUser.getName();
    }

    public void newSuggestion(){
        mSuggestion = mAlgorithm.getSuggestion();
        setChanged();
        notifyObservers(mSuggestion);
    }
 
    //Adds the user to the UserDataBase and 
    public void addNewUser(Person user){
        setCurrentUser(user);
        addUser(user);
    }

    private void test(){
        Person person1 = new Person("Alice", 30, Gender.FEMALE, new int[]{35, 40}, 2, "Rock", new String[]{"Movie1", "Movie2", "Movie3"}, new String[]{"Musician1", "Musician2", "Musician3"}, "None");
        Person person2 = new Person("Bob", 25, Gender.MALE, new int[]{45, 55}, 1, "Pop", new String[]{"Movie4", "Movie5", "Movie6"}, new String[]{"Musician4", "Musician5", "Musician6"}, "Christianity");
        addUser(person2);
        addUser(person1);
    }

}


