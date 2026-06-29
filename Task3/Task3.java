import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm= new ATM();
        while(true){
            System.out.println("Welcome To ATM ");
            System.out.println(" 1. Check Balance");
            System.out.println(" 2.Deposit");
            System.out.println(" 3. Withdraw");
            System.out.println(" 4. Exit");

            System.out.println("Enter Choice");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    atm.checkBalance();
                    break;

                case 2:
                    System.out.println("Enter Amount");
                    double deposit = sc.nextDouble();
                    atm.deposit(deposit);
                    break;
                case 3:
                    System.out.println("Enter Amount ");
                    double withdraw= sc.nextDouble();
                    atm.withdraw(withdraw);
                    break;
                case 4:
                    System.out.println(" Thanks for Visiting.");
                    return;

                default:
                    System.out.println(" Invalid Choice");
                    break;
            }
        }


    }
}
