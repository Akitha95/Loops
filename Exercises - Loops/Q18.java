public class Q18 {
    public static void main(String[] args) {
        System.out.println("");
        // 1
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }

        // 2
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 3
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k > 5 - i; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 4
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }

        // 5
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            for (int j = 1; j < i; j++) {
                System.out.print(i);
            }
            System.out.println("");

        }

        // 6
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(-j + i + 1);
            }
            for (int j = 1; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");

        }

    }
}
