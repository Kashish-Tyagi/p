public class FloydTriiangle {

    public static void main(String[] args) {

        int m = 5;
        int var = 1;
        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(var + " ");
                var++;
            }
            System.out.println();
        }
    }
}
