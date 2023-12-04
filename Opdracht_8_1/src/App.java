public class App {
    public static void main(String[] args) throws Exception {
        SharedList buffer = new SharedList(10);

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
