import java.util.*;
public class multiply{
    public static void main(String[] args) {
        System.out.println("Enter the number first and second");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c ;
        c=a*b ;
        System.out.println("The product of the two numbers is " + c);
        sc.close();
    }
}