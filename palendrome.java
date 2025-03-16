import java.util.Scanner;
public class palendrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scanner.nextInt();
        int originalNum=num;
        int reverse=0;
        while(num>0){
            int rem=num%10;
            reverse=(reverse*10)+rem;
            num=num/10;
        }
        if(originalNum==reverse){
            System.out.println("palendrome");
        }else{
            System.out.println("not palendrome");
        }
        scanner.close();
    }
};
