import java.util.Scanner;;

public class Q12 {
    public static void main(String[] args) {

        boolean isNum = true;
        int num, largestNum = 0, smallestNum = 0, i = 0;

        try (Scanner sc = new Scanner(System.in)) {
            while (isNum) {
                System.out.print("Enter Number : ");
                String input = sc.nextLine();

                try {
                    num = Integer.parseInt(input);
                    isNum = true;
                    if (i == 0) {
                        smallestNum = num;
                        largestNum = num;

                    }

                } catch (Exception e) {
                    isNum = false;
                    break;
                }

                if (isNum) {
                    if (num > largestNum) {
                        largestNum = num;
                    }

                    if (num < smallestNum) {
                        smallestNum = num;

                    }

                } else {
                    break;

                }
                i++;
            }

            System.out.println("\nLargest number = " + largestNum);
            System.out.println("Smallest number = " + smallestNum);
        }
    }

}
