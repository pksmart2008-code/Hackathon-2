import java.util.Scanner;

class BankAccount {
    String no, name;
    double bal;

    BankAccount(String n, String h, double b) {
        no = n;
        name = h;
        bal = b;
    }

    void deposit(double x) {
        bal += x;
    }

    void withdraw(double x) {
        if (x <= bal)
            bal -= x;
        else
            System.out.println("Insufficient balance");
    }

    double checkBalance() {
        return bal;
    }

    void displayAccount() {
        System.out.println("Account Number: " + no);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + bal);
    }
}

public class Hackathon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String no = sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter balance: ");
        double bal = sc.nextDouble();

        BankAccount a = new BankAccount(no, name, bal);

        System.out.print("Enter deposit: ");
        a.deposit(sc.nextDouble());

        System.out.print("Enter withdrawal: ");
        a.withdraw(sc.nextDouble());

        a.displayAccount();
    }
}