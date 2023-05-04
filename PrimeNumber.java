import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int temp;
        boolean isPrime = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        scanner.close();
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is NOT prime");
        }


    }
}
