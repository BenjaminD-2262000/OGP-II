import java.lang.reflect.Method;
import java.util.Scanner;


public class methodInvoker {
    Method met;

    public methodInvoker(String met){
        this.met = Method;
        invokeMethod();
    }

    private void invokeMethod(){
        try{
            Scanner input = new Scanner(System.in);
            int paramCount = met.getParameterCount();
            System.out.println("this parameter needs " + paramCount + "parameters");
            Object paramTypes[] = met.getParameterTypes();
            Object arglist[] = new Object[paramCount];
            for(int i = 0; i < paramCount; ++i){
                System.out.println("param " + (i+1) + " of type " + paramTypes[i]);
                
                if(paramTypes[i] instanceof Integer){
                    arglist[i] = input.nextInt();
                }else if(paramTypes[i] instanceof String){
                    arglist[i] = input.nextLine();
                } else {
                    throw (new Exception("wrong parameter type, try again"));
                }
            }
            System.out.println("uitvoering gelukt");
            System.out.println(met.invoke(arglist));
        } catch (Throwable e){System.err.println(e);}
    }
}
