import java.util.Scanner;

public class Choices {
    Scanner scan = new Scanner(System.in);
    public double balance = 0.00;
    public int choice;
    public int amount;

    public void atm(){
        System.out.println("1. Check balance\n2. Deposit\n3. Withdraw\n\t");
        choice = scan.nextInt();

        if (choice == 1){
            System.out.println("Balance is: "+balance);
        }
        else if (choice == 2) {
            System.out.println("Amount deposited: ");
            amount = scan.nextInt();
            balance += amount;
            System.out.println("Balance is: "+balance);
        }
        else if (choice == 3) {
            System.out.println("Amount withdrawn: ");
            amount = scan.nextInt();
            balance -= amount;
            System.out.println("Balance is: "+balance);
        }
        else {
            System.out.println("Not a valid choice");
            (new Choices()).atm();
        }
    }

    public static void main(String[] args){
        (new Choices()).atm();
    }
}
