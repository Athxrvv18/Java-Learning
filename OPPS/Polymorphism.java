public class Polymorphism {

    public static void main(String[] args) {

        calcultor c1 = new calcultor();
        System.out.println(c1.sum(10,20));
        System.out.println(c1.sum(10,20,20));
        System.out.println(c1.sum(1.4f,2.4f));
        System.out.println(c1.sum(10.5f,20.3f,23.3f));


    }

}

class calcultor {

    // this complie time polymorphism 
    // sum name is same in each methods
    int sum(int a, int b) {
        return a + b;
    }
// parameter incresed

    int sum(int a, int b, int c) {
        return a + b + c;
    }
    // deferent dataType 
    float sum(float a, float b) {
        return a + b;
    }
// parameter incresed
    float sum(float a, float b, float c) {
        return a + b + c;
    }

}