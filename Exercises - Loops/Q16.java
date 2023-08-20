import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter term : ");
            int num = sc.nextInt();

            double sum = 0;

            for (int i = 1; i <= num; i++) {

                int n;
                if (i % 2 == 0) {
                    n = -1;
                } else {
                    n = 1;
                }

                sum = sum + ((1.0 / i) * n);
            }

            System.out.println("sum = " + sum);
        }

    }
}
