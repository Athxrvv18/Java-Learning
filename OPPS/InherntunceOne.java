public class InherntunceOne {
    
    public static void main(String[] args) {
      fish f1 = new fish();
      // here in fish class there is one method is swim but we exented the animal class thats whhy we are using animals method also
      f1.eat();  
      f1.breath();
    }

}

// this is parent class or base case 
class Animal{
    String color;

    // this  methods will pass on fish call 
    void eat(){
        System.out.println("eats!");
    }

    void breath(){
        System.out.println("breathe!");
    }

}
// by this extends word and classname
class fish extends Animal{
    int fins;


    void swim(){
        System.out.println("swim!");
    }
}

