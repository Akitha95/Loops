import java.util.Scanner;
import java.util.Random;

public class Q17 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Random rmd = new Random();
            int randomNum = rmd.nextInt(11);
            int num;

            int i = 0;

            while (i == 0) {
                System.out.print("\nGuss the Number : ");
                num = sc.nextInt();
                if (num < randomNum) {
                    System.out.println("Too low, try again");

                } else if (num > randomNum) {
                    System.out.println("Too high, try again");
                } else {
                    System.out.println("------------");
                    System.out.println("You Win !!!");
                    System.out.println("------------");
                    break;

                }
            }

        }
    }
}
