import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int inText = 0;
            int pos = 0, neg = 0, zer = 0;
            int num;
            boolean isNum;

            while (inText == 0) {
                System.out.print("Enter No : ");
                String input = sc.nextLine();
                // char ch = input.charAt(0);

                try {
                    num = Integer.parseInt(input);
                    isNum = true;

                } catch (Exception e) {
                    isNum = false;
                    break;
                }
                if (isNum) {

                    if (num > 0) {
                        pos += +1;
                    } else if (num < 0) {
                        neg += +1;

                    } else if (num == 0) {
                        zer += +1;

                    } else {
                        inText = 1;
                        break;
                    }

                } else {
                    break;

                }

            }

            System.out.println("The cunt of positive = " + pos);
            System.out.println("The cunt of negative = " + neg);
            System.out.println("The cunt of zeros = " + zer);
        }

    }

}
