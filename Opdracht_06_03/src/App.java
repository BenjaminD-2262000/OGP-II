public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    /**
     * 
     * @param <U> any subtypes of the Number type
     * @param array an array of a subtype of Number
     * @return float sum of all 
     */
    public static <U extends Number> float addNumbers(U[] array){
        float sum = 0;
        for (U num : array){
            sum += num.floatValue();
        }
        return sum;
    }
}
