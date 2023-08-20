public class Q13 {

    public static void main(String[] args) {

        for (int i = 1; i <= 500; i++) {

            int length = (int) Math.log10(i) + 1;
            int arrayValuve[] = new int[length];
            int pVal = 0;

            for (int j = 0; j <= length - 1; j++) {
                arrayValuve[j] = (i % ((int) Math.pow(10, length - j))) / ((int) Math.pow(10, length - 1 - j));
            }

            for (int k = 0; k < length; k++) {
                pVal += (int) Math.pow(arrayValuve[k], length);
            }

            if (i == pVal) {
                System.out.println(i);
            }

        }
    }
}
