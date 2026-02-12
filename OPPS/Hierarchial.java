
class Animal {
    String color;

    void eat() {
        System.out.println("eats!");
    }

    void breath() {
        System.out.println("breathe!");
    }

}

class fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swim!");
    }
}

class mimmal extends Animal {
    int legs;

    void walk() {
        System.out.println("walk!");
    }
}

class bird extends Animal {
    int fly;

    void fly() {
        System.out.println("flys!");
    }
}

public class Hierarchial {
    public static void main(String[] args) {
        bird b1 = new bird();
        b1.eat();
        b1.fly();
        b1.breath();

    }
}
