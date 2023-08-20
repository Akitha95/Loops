import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter integer : ");
            String num = sc.nextLine();

            char[] chars = num.toCharArray();

            for (int i = chars.length - 1; i >= 0; i--) {
                System.out.print(chars[i]);
            }
        }
    }
}
