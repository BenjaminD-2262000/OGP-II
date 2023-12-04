import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("SecretClass.class");
        Method m[] = cls.getDeclaredMethods();
        for(int i=0; i<m.length; i++)
            System.out.println(m[i].toString());
    }
}
