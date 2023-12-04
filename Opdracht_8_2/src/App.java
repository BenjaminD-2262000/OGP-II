import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Faculteit fac = new Faculteit();
        ArrayList<Number> list = fac.faculteitMultiplex(new ArrayList<>(Arrays.asList(1,3,10,5,20,8)));
        System.out.println(list.toString());
    }
}
