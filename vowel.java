//wap to check whether the inputed char is vowel or consonant
//wap to find largest among three numbers
import java.util.*;
public class vowel {
    public static void main(String[] args){
        System.out.println("Enter the char:");
        Scanner sc = new Scanner(System.in);
        char str = sc.next().charAt(0);
        if(str=='a' || str=='e' || str=='i'|| str=='o' || str=='u' || str=='A' || str=='E'|| str=='I'|| str=='O' || str=='U'){
            System.out.println("The char is vowel!");
        }else{
            System.out.println("The char is consonent!");
        }
        sc.close();
    }
}


// nextBoolean
// nestByte
// nextDouble
// nextFloat
// nextInt
// nextLine
// nextLong
// nextShort