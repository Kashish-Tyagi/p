public class numberStopwatch {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {

                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {

            for (int j = 0; j <= i; j++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {

                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
