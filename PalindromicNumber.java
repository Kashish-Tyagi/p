public class PalindromicNumber {
    public static void main(String[] args) {

        int m = 5;

        for (int i = 1; i <= m; i++) {

            for (int k = 1; k <= m - i; k++) {

                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
