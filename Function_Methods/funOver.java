public class funOver {
    // function overloading using parameters :
    public static int sum(int a, int b) {

        return a + b;
    }

    public static int sum(int a, int b, int c) {

        return a + b + c;
    }


    // function overloading using data types

    public static int add(int a , int b){
        return a+b;
    }

    public static float add(float a , float b){
        return a+ b;

    }

    public static void main(String arg[]) {
        int a = 5;

        int b = 10;
        int c = 23;
        float d = 5;
        float e = 10;
        System.out.println(sum(a, b));
        System.out.println(sum(a, b, c));

        System.out.println(add(a,b));
        System.out.println(add(d,e));
    }
}
