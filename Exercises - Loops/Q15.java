import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("terms in the series : ");
            int num = sc.nextInt();

            float sum = 0;

            for (float i = 1; i <= num; i++) {
                sum += +(1 / i);

            }

            System.out.println("Sum = " + sum);
        }
    }
}
