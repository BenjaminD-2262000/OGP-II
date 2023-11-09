import java.util.List;
import java.util.Random;

public class RandomAlgorithm implements Algorithm{
    Person mUser;
    List<Person> mUserDB;

    public RandomAlgorithm(Person user, List<Person> userDB){
        mUser = user;
        mUserDB = userDB;
    }

    @Override
    public Person getSuggestion(){
        Random rand = new Random();
        Person suggestion;
        do {
            int suggestIndex = rand.nextInt(mUserDB.size());
            suggestion = mUserDB.get(suggestIndex); 
        } while (suggestion == mUser);
        return suggestion;
    }

}
