public class StringBufferExample {
    public static void main(String[] args) {
        // Step 1: Create StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Step 2: Append text
        sb.append(" World");
        System.out.println("After Append: " + sb);

        // Step 3: Insert text
        sb.insert(6, "Java ");
        System.out.println("After Insert: " + sb);

        // Step 4: Replace text
        sb.replace(6, 10, "Python");
        System.out.println("After Replace: " + sb);

        // Step 5: Delete text
        sb.delete(6, 13);
        System.out.println("After Delete: " + sb);

        // Step 6: Reverse the string
        sb.reverse();
        System.out.println("After Reverse: " + sb);

        // Step 7: Get and modify specific character
        System.out.println("Character at index 2: " + sb.charAt(2));
        sb.setCharAt(2, 'Z');
        System.out.println("After setCharAt(2, 'Z'): " + sb);

        // Step 8: Get length and capacity
        System.out.println("Length of StringBuffer: " + sb.length());
        System.out.println("Capacity of StringBuffer: " + sb.capacity());
    }
}

