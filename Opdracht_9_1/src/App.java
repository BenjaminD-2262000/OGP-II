import java.lang.reflect.Method;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Class name?");
        
        String className = input.nextLine();
        Class cls = Class.forName(className);
        Method m[] = cls.getDeclaredMethods();
        for(int i=0; i<m.length; i++)
            System.out.println(m[i].toString()); 

    }
}
