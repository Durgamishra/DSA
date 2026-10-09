import java.util.Scanner;
class EvenOrOdd{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check even or odd: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("The given number is even.");
        }else{
            System.out.println("The given number is odd.");
        }
    }
}