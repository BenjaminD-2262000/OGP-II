
public class Consumer extends Thread{
    private SharedList buffer;
    int value;

    public Consumer(SharedList buffer){
        this.buffer = buffer;
    }

    public void run(){
        while(true){
            try{
                value = buffer.consume();
                System.out.print("the number " + value + " primefactorised is: ");
                primeFactorize(value);


            } catch (InterruptedException e) {
            e.printStackTrace();
            }
        }
    }

    private static void primeFactorize(int number) {
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
        System.out.println();
    }

}
