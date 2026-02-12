public class Hybrid {
    
public static void main(String[] args) {
    
    human h1 = new human();
    h1.eat();
    h1.breath();
    h1.walk();
    h1.speak();
}
    
}


class Animal{

    String color;

    void eat() {
        System.out.println("eats!");
    }

    void breath() {
        System.out.println("breathe!");
    }
}


class fish extends Animal{

    void fly(){
        System.out.println("fly");
    }
}

class tuna extends fish{

     void swim(){
       System.out.println("SWIM!"); 
     }
}

class shark extends fish{
     void teeth(){
        System.out.println("TEETH!");
     }
}

class bird extends Animal{
    void fly(){
        System.out.println("FLY!");
    }
}

class mimmal extends Animal{
    void walk(){
        System.out.println("WALK!");
    }
}

class dog extends mimmal{

    void bark(){
        System.out.println("BARK!");
    }
}

class cat extends mimmal{

    void miaav(){
        System.out.println("MIAAAV!");

    }
}

class human extends mimmal{

    void speak(){
        System.out.println("SPEAK!~");
    }
}