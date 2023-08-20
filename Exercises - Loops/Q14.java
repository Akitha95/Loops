import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int num = 1;
            int f1 = 1, f2 = 1;

            try {
                System.out.print("How many terms : ");
                num = sc.nextInt();
            } catch (Exception e) {

            }

            for (int i = 1; i <= num; i++) {
                int f3 = f2 + f1;
                f1 = f2;
                f2 = f3;

                System.out.println(f3);
            }
        }

    }
}
