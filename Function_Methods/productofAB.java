public class productofAB {
    public static int product(int a, int b) {

        int prod = a * b;
        return prod;
    }

    public static void main(String[] args) {

        int a = 50;
        int b = 3;
        int product = product(a, b);
        System.out.println(product);
        product = product(5, 10);
        System.out.println(product);
    }
}
