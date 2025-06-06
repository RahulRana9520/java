public class StringExample {
    public static void main(String[] args) {
        String s1 = "Rahul";
        s1.concat(" Rana");  // This doesn't change s1
        System.out.println("s1: " + s1);  // Output: Rahul

        String s2 = s1.concat(" Rana");  // New object is created
        System.out.println("s2: " + s2);  // Output: Rahul Rana
    }
}
