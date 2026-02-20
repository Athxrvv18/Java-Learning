public class Opps {

    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.sound();

        Animal a1 = new Animal();
        a1.sound();
        c1.count(10, 5);
        a1.count(10.2f, 13.64f);
    }
}

class Animal {

    public void count(int a, int b) {
        System.out.println(a + b);

    }

    public void count(float a, float b) {
        System.out.println(a + b);
    }

    public void sound() {
        System.out.println("BARKKK");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("MEOWW MEOWW!");
    }
}