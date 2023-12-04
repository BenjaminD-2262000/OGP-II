import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("What method to invoke?");
        Scanner input = new Scanner(System.in);
        methodInvoker metInv = new methodInvoker(input.nextLine());
    }
}
