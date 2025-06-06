public class FinalVariableExample {
    final int MAX_SPEED = 120;

    void showSpeed() {
        // MAX_SPEED = 150;  // ❌ Error: cannot assign a value to final variable
        System.out.println("Max Speed is: " + MAX_SPEED);
    }

    public static void main(String[] args) {
        FinalVariableExample obj = new FinalVariableExample();
        obj.showSpeed();
    }
}
