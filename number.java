public class number {
    public static void main(String[] args) {

        int m = 4;
        int var = 0;
        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= i; j++) {
                var = i;
                System.out.print(var);

                var--;
            }
            System.out.println();
        }
    }
}
