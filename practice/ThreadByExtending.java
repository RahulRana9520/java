// File: ThreadByExtending.java

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(500);  // Sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadByExtending {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // Starts a new thread
    }
}
