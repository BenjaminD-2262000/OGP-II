import java.util.Observable;

public class Person extends Observable{
    private String mName;
    private int mAge;
    private Gender mGender;
    private int[] mLocation = new int[2];
    private int mChildren;
    private String mMusicGenre;
    private String[] mFavMovies = new String[3];
    private String[] mFavMusicians = new String[3];
    private String mReligion;


    public Person(){}

    public Person(String name, int age, Gender gender, int[] location, int children, String musicGenre, String[] favMovies, String[] favMusicians, String religion) {
        this.mName = name;
        this.mAge = age;
        this.mGender = gender;
        this.mLocation[0] = location[0];
        this.mLocation[1] = location[1];
        this.mChildren = children;
        this.mMusicGenre = musicGenre;
        this.mFavMovies = favMovies;
        this.mFavMusicians = favMusicians;
        this.mReligion = religion;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    // Getter and Setter for mAge
    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        this.mAge = age;
    }

    // Getter and Setter for mGender
    public Gender getGender() {
        return mGender;
    }

    public void setGender(Gender gender) {
        this.mGender = gender;
    }

    // Getter and Setter for mLocation
    public int[] getLocation() {
        return mLocation;
    }

    public void setXcord(int X) {
        this.mLocation[0] = X;
    }

    public void setYcord(int Y){
        this.mLocation[1] = Y;
    }

    // Getter and Setter for mChildren
    public int getChildren() {
        return mChildren;
    }

    public void setChildren(int children) {
        this.mChildren = children;
    }

    // Getter and Setter for mMusicGenre
    public String getMusicGenre() {
        return mMusicGenre;
    }

    public void setMusicGenre(String musicGenre) {
        this.mMusicGenre = musicGenre;
    }

    // Getter and Setter for mFavMovies
    public String[] getFavMovies() {
        return mFavMovies;
    }

    public void setFavMovies(String[] favMovies) {
        this.mFavMovies = favMovies;
    }

    // Getter and Setter for mFavMusicians
    public String[] getFavMusicians() {
        return mFavMusicians;
    }

    public void setFavMusicians(String[] favMusicians) {
        this.mFavMusicians = favMusicians;
    }

    // Getter and Setter for mReligion
    public String getReligion() {
        return mReligion;
    }

    public void setReligion(String religion) {
        this.mReligion = religion;
    }
}
