import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mark: ");
        int marks = sc.nextInt();
        if(marks>=90){
            System.out.println("Excellent");
        }else if(marks>=75){
            System.out.println("Good");
        }else if(marks>=60){
            System.out.println("Not bad");
        }else if (marks>=50) {
            System.out.println("fair");
        }else if (marks>=33) {
            System.out.println("passed but need improvement");
        }else if(marks<33){
            System.out.println("fail");
        }else{
            System.out.println("Enter valid mark 0-100");
        }
    }
    
}
