import java.util.Scanner;

class IsPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check prime or not: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Not a prime number");
        } 
        else {
            boolean isPrime = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not a prime number");
            }
        }

        sc.close();
    }
}