import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("To exit - enter latter\n");

            int num, x = 1, sumEven = 0, sumOdd = 0;
            while (x == 1) {

                try {
                    System.out.print("Enter Number : ");
                    num = sc.nextInt();

                    if (num % 2 == 0) {
                        sumEven += num;

                    } else {
                        sumOdd += num;
                    }
                } catch (Exception e) {
                    break;
                }
            }
            System.out.println("Sum of the even itegers = " + sumEven);
            System.out.println("Sum of the odd itegers = " + sumOdd);
        }

    }

}
