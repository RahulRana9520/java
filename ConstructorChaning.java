class Demo {
    int a, b, c;

    // Constructor 1
    Demo() {  
        this(10, 20); // Calls Constructor 2  
        System.out.println("Default Constructor");
    }

    // Constructor 2
    Demo(int x, int y) {  
        this(x, y, 30); // Calls Constructor 3  
        System.out.println("Two-argument Constructor");
    }

    // Constructor 3
    Demo(int x, int y, int z) {  
        a = x;  
        b = y;  
        c = z;  
        System.out.println("Three-argument Constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Demo obj = new Demo();  
    }
}
