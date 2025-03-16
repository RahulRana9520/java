import java.util.*;
public class Natural {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int natu=0;
        for(int i=1;i<=n;i++){
            natu=natu+i;
        }
        System.out.println("the n is:"+natu);
        sc.close();
    }
}
