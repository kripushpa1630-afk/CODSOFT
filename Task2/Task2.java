import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Total number of subjects");
        int n= sc.nextInt();
        System.out.println("Marks Should be within 100");
        int sum = 0;
        String grade;
        for(int i=1;i<=n;i++){
            System.out.println("Enter the marks of "+i+ " Subject");
            int marks=sc.nextInt();
            sum = sum + marks;
        }
        double percentage = (sum*100.0/(n*100));
        if(percentage>=90){
            grade="A+";
        }
        else if(percentage>=80){
            grade="A";
        }
        else if(percentage>=70){
            grade="B";
        } else if (percentage>=60) {
            grade="C";

        } else if (percentage>=50) {
            grade="D";

        }
        else {
            grade="F";
        }
        System.out.println("Total Marks Obtained = "+sum);
        System.out.println("Percentage = "+percentage+"%");
        System.out.println("Grade = "+grade);


    }
}

