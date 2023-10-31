public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Swap swap = new Swap();
        swap.genericSwapArray(new String[]{"is","dit","een","goede","vraag?"},2,4);
    }
}
