class CSthread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("CSthread: Execution " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("CSthread interrupted");
            }
        }
    }
}

class ITthread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("ITthread: Execution " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("ITthread interrupted");
            }
        }
    }
}

public class Ques19 {
    public static void main(String[] args) {
        CSthread cs = new CSthread();
        ITthread it = new ITthread();
        cs.start();
        it.start();
        try {
            cs.join();   //wait for other thread to complete excution
            it.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
