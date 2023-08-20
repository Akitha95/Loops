import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first no : ");
            int num1 = sc.nextInt();
            System.out.print("Enter second no : ");
            int num2 = sc.nextInt();
            int pwr = 1;

            for (int i = 1; i <= num2; i++) {
                pwr *= num1;
            }

            System.out.println("power is = " + pwr);
        }
    }
}
