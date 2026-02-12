public class FutnOverriding{


    public static void main(String arg[]){
        Animal a1= new Animal();
        deer d1 = new deer();

        d1.eat();
        a1.eat();
        

    }
}

class Animal{

    void eat(){
        System.out.println("EAT ANYTHING!");
    }
}


class deer extends Animal{
    void eat(){
       System.out.println("EAT GRASSS!");

    }
}