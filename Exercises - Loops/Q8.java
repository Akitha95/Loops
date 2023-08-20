import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number : ");
            int num = sc.nextInt();
            boolean isPrime = false;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    i = num;
                } else {
                    isPrime = true;
                }
            }

            if (isPrime) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a Prime Number");
            }
        }
    }
}
