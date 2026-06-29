
public class ATM {
    double balance = 10000;
    public void checkBalance(){
        System.out.println("Balance "+ balance);
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println(amount+" deposited Successfully.");
    }
    public void  withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println(amount+" withdrawn Successfully. ");
        }
        else {
            System.out.println("Insufficient Balance.");
        }
    }
}
