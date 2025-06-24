class Buffer {
    int value;
    boolean available = false;

    synchronized void produce(int val) throws InterruptedException {
        while (available) wait();
        value = val;
        available = true;
        System.out.println("Produced: " + val);
        notify();
    }

    synchronized int consume() throws InterruptedException {
        while (!available) wait();
        available = false;
        System.out.println("Consumed: " + value);
        notify();
        return value;
    }
}

class Ques20 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) buffer.produce(i);
            } catch (InterruptedException e) {}
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) buffer.consume();
            } catch (InterruptedException e) {}
        });

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread exiting.");
    }
}
