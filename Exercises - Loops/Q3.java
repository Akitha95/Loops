import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("input a positive integer : ");
            int input = sc.nextInt();

            for (int i = 1; i <= 12; i++) {
                System.out.printf("%d x %d = %d\n", input, i, (input * i));
            }
        }
    }
}
