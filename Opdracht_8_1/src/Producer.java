import java.util.Random;

public class Producer extends Thread{
    private Random rand = new Random();
    private SharedList buffer;
    private int value;
    
    public Producer(SharedList buffer){
        this.buffer = buffer;
    }

    public void run(){
        while(true){
            try{
                value = rand.nextInt(100, 1000);
                buffer.produce(value);
                System.out.println("the number " + value + " was added");


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
