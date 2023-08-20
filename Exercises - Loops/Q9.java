import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Frist Number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter Second Number : ");
            int num2 = sc.nextInt();

            int hcf = 0;
            int largeNo = 0, smallNo = 0, remainder;

            if (num1 > num2) {
                largeNo = num1;
                smallNo = num2;
            } else {
                largeNo = num2;
                smallNo = num1;
            }

            do {
                remainder = largeNo % smallNo;

                if (remainder == 0) {
                    hcf = smallNo;

                    break;
                } else {
                    largeNo = smallNo;
                    smallNo = remainder;
                }

            } while (remainder != 0);

            System.out.println("HCF = " + hcf);
        }
    }

}
