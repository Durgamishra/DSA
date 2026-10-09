import java.util.*;

public class InverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int inv = 0;
        int pos = 1;

        while (n != 0) {
            int digit = n % 10;

            inv = inv + pos * (int) Math.pow(10, digit - 1);

            n = n / 10;
            pos++;
        }

        System.out.println("Inverse number: " + inv);

        sc.close();
    }
}