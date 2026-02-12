class Animal {
    int legs;
}

class Mammal extends Animal {
    String color;
}

class Dog extends Mammal {
    float weight;
}

public class MultiInheritance {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.legs = 4;
        d.color = "Black";
        d.weight = 15.2f;

        System.out.println(d.legs + " " + d.color + " " + d.weight);
    }
}
