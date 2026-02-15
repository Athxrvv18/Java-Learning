
public class Abstract{
    public static void main(String[] args) {
        Horse h1 = new Horse();
        Cat c1 = new Cat();

        h1.eats();
        h1.walk();
        c1.eats();
        c1.walk();


    }
}
// abstract == ideaa(just idea not implimention )

// in abstract class we cannot create objects of that class
abstract class Animal{

    void eats(){
        System.out.println("EATSSS!");
    }
// in abtract methods we only declear not initilize 
    abstract void walk();
}
// extend class of abstract :
class Horse extends Animal{
// here initilized 
    void walk(){
        System.out.println("HORSE WALK IN 2 LEGS!");
    }
} 

class Cat extends Animal{
    void walk(){
        System.out.println("CAT WALK ON 4 LEGSS !");
    }
}