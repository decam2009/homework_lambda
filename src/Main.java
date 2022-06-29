public class Main {

    private static OnTaskDoneListener listener = System.out::println;
    private static OnTaskErrorListener errorListener = System.out::println;
    private static Worker worker = new Worker(listener, errorListener);

    public static void main(String[] args) {
        worker.start();
    }
}
