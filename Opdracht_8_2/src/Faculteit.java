import java.util.ArrayList;
import java.math.BigInteger;

public class Faculteit extends Thread{
    ArrayList<Number> facultyList;
    public void run(){
        synchronized(facultyList) {
            for (int i = 0; i < facultyList.size(); ++i){
                System.out.println(i);
                facultyList.set(i, (Number)faculteit(facultyList.get(i).intValue()));
            }
        }
    }

    private BigInteger faculteit(int base){
        if(base == 1 || base == 0){
            return BigInteger.ONE;
        }
        BigInteger result = BigInteger.valueOf(base);

        return result.multiply(faculteit(base - 1));
    }

    public ArrayList<Number> faculteitMultiplex(ArrayList<Number> lijstje)
    {
        this.facultyList = lijstje;
        start();
        try {
            join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return facultyList;
    }
}
