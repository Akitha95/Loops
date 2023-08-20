import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            char loop;
            do {
                System.out.print("\nEnter First No : ");
                int num1 = sc.nextInt();
                System.out.print("Enter Second No : ");
                int num2 = sc.nextInt();

                System.out.println("\nSum = " + (num1 + num2) + "\n");

                System.out.print("Do you want the operation again (y/n) : ");
                loop = sc.next().charAt(0);

            } while (loop == 'y' || loop == 'Y');

        }
    }
}
