interface Printable {
    void print();  // abstract by default
}

interface Showable {
    void show();  // another interface
}

class Document implements Printable, Showable {
    public void print() {
        System.out.println("Printing document...");
    }

    public void show() {
        System.out.println("Showing document...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();  // Output: Printing document...
        doc.show();   // Output: Showing document...
    }
}
