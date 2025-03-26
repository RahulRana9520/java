class MathOperations {
    // Method 1: Adding two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adding three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Adding two doubles
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        System.out.println("Sum (int): " + obj.add(5, 10));           // Calls add(int, int)
        System.out.println("Sum (3 ints): " + obj.add(5, 10, 15));    // Calls add(int, int, int)
        System.out.println("Sum (double): " + obj.add(5.5, 2.5));     // Calls add(double, double)
    }
}
