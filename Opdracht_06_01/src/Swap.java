import java.util.Arrays;

public class Swap {
    public Swap(){

    }
    /**swap 2 numbers in an array of any types
     * @param array an array of any type
     * @param i de index van het eerste element om gewisseld te worden
     * @param j de index van het tweede element om gewisseld te worden
     * @param <T> the type of the param array
     * @pre array.length > max(i, j)
     * @return an array of the same type as the param array
     */
    public <T> T[] genericSwapArray(T[] array, int i, int j){
        T[] newArray = Arrays.copyOf(array, array.length);
        newArray[i] = array[j];
        newArray[j] = array[i];

        for(T o: newArray){
            System.out.println(o.toString());
        }

        return newArray;
    }
}   
