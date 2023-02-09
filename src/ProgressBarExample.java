import javax.swing.*;

   public class ProgressBarExample {
      public static void main(String[] args) {
                JFrame frame = new JFrame("Progress Bar Example");
                JProgressBar progressBar = new JProgressBar();
                progressBar.setStringPainted(true);
                frame.add(progressBar);
                frame.setSize(300, 100);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

                // Simulating a task that takes some time
                for (int i = 0; i <= 100; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    progressBar.setValue(i);
                }
            }
        }

