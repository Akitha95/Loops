import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number : ");
            int input = sc.nextInt();
            int fac = 1;

            for (int i = input; i > 0; i--) {
                fac *= i;
            }

            System.out.println("factorial value is = " + fac);
        }
    }
}