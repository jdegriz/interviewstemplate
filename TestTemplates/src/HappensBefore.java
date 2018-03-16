public class HappensBefore {

    int a = 0;
    volatile int b = 0;

    Runnable first = new Runnable() {
        @Override
        public void run() {
            a = 4;
            b = 5;
        }
    };

    Runnable second = new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(10000);
                System.out.println(a); //What is the output
                System.out.println(b); //What is the output
                System.out.println(a); //What is the output
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }
    };

    public static void main(String[] args) {
        new HappensBefore().startThreads();
    }

    void startThreads() {
        Thread firstThread = new Thread(first);
        Thread secondThread = new Thread(second);

        firstThread.start();
        secondThread.start();
    }
}
