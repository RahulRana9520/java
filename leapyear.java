//wap to find the leap year using scanner
import java.util.*;
public class leapyear{
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a % 4==0 && a % 100!=0 || a % 400==0){
            System.out.println("The year is a leap year!");
        }else{
            System.out.println("the year is not a leap year!");
        }
        scan.close();
    }
}
