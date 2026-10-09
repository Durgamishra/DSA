import java.util.Scanner;

class Fibonacci{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int firstNumber = 0;
        int secondNumber =1;
        for (int i=1;i<=n;i++){
            System.out.println(firstNumber);
            int sum=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=sum;
        }
    }
}