import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int num1;
        int num2;
        Random rand = new Random();
        for (int i = 0; i < 25; ++i){
            num1 = rand.nextInt(100);
            num2 = rand.nextInt(100);
            if (num1 > num2){
                System.out.println(num1 + " > " + num2);
            } else if (num1 < num2){
                System.out.println(num1 + " < " + num2);
            } else {
                System.out.println(num1 + " = " + num2);
            }
        }
    }
}
