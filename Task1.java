import java.util.Random;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the number between 1 and 100.");
        Random random=new Random();
        int randomNo=random.nextInt(100)+1;
        int attempt=0;
        while(true){
            System.out.print("Please Guess the Number");
            int num=sc.nextInt();
            attempt++;
            if(num==randomNo){
                System.out.println("yayy!! You got the number");
                System.out.println("Total attempts = "+attempt);
                break;
            } else if (num<randomNo){
                System.out.println("Number is too low");

            }
            else{
                System.out.println("Number is too high");
            }
        }


    }
}

