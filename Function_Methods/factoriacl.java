public class factoriacl {

    public static void main(String[] args) {
        int a = 4;
        System.out.println(factoriacl(a));
    }

    public static int factoriacl(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
