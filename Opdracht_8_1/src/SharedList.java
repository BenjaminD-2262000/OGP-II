import java.util.LinkedList;

public class SharedList {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity;

    public SharedList(int capacity){
        this.capacity = capacity;
    }

    public synchronized void produce(int value) throws InterruptedException{
        while(buffer.size() == capacity){
            wait();
        }
        notifyAll();
        buffer.add(value);
    }

    public synchronized int consume() throws InterruptedException {
        while(buffer.isEmpty()){
            wait();
        }

        int value = buffer.removeFirst();
        notifyAll();
        return value;
    }
}
