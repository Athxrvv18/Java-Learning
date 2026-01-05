import java.util.*;

public class bion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(boi(c, r));

    }

    public static int boi(int a, int b) {
        int nf = fact(a);
        int bf = fact(b);
        int n_b = fact(a- b);

        int boi = nf / (bf * n_b);

        return boi;
    }

    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }

        return fact;
    }
}