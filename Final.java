class TestFinalVariable {
    final int MAX = 100;  // Constant variable

    void display() {
        // MAX = 200; // ❌ ERROR: Cannot modify a final variable
        System.out.println("MAX value: " + MAX);
    }

    public static void main(String[] args) {
        TestFinalVariable obj = new TestFinalVariable();
        obj.display();
    }
}
