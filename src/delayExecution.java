public class delayExecution {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}