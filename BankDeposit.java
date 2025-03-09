import java.util.Scanner;
class BankDeposit {
    public static void main(String args[]) {
        System.out.println("Welcome to the bank!");
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 3) {
            System.out.println("\nEnter 1 for Term Deposit");
            System.out.println("Enter 2 for Recurring Deposit");
            System.out.println("Enter 3 to Exit");
            
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Principal Amount:");
                    double p1 = sc.nextDouble();
                    System.out.println("Enter Rate of Interest (in %):");
                    double r1 = sc.nextDouble();
                    System.out.println("Enter Time Period (in years):");
                    int n1 = sc.nextInt();
                    double a1 = p1 * Math.pow((1 + r1 / 100), n1);
                    System.out.println("Maturity Amount: " + a1);
                    break;
                case 2:
                    System.out.println("Enter Monthly Installment:");
                    double p2 = sc.nextDouble();
                    System.out.println("Enter Rate of Interest (in %):");
                    double r2 = sc.nextDouble();
                    System.out.println("Enter Time Period (in months):");
                    int n2 = sc.nextInt();
                    double a2 = p2 * n2 + (p2 * n2 * (n2 + 1) / 2.0 * r2 / 100.0 * 1 / 12.0);
                    System.out.println("Maturity Amount: " + a2);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }
        }
        sc.close();
    }
}

