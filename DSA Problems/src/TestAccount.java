import java.util.Scanner;
public class TestAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance (in cents): ");
        int bal = sc.nextInt();
        System.out.print("Enter Rate of Interest: ");
        double roi = sc.nextDouble();
        Account acc = new Account(id, name, bal, roi);
        acc.display_account();
        System.out.print("\nEnter amount to deposit (in cents): ");
        int dep = sc.nextInt();
        acc.deposit(dep);
        acc.display_balance();
        System.out.print("\nEnter amount to withdraw (in cents): ");
        int wd = sc.nextInt();
        acc.withdraw(wd);
        acc.display_balance();
    }
}
