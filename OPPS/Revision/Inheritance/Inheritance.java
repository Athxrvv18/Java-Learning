

public class Inheritance{
    
    public static void main(String arg[] ){

        F101 f1 = new F101();
        f1.open();
        f1.close();

    }

}

class Home{

    int door;
    String name;

    void open(){
        System.out.println("HOME IS OPEN ");
    }

      void close(){
        System.out.println("HOME IS close ");
    }

}

class F101 extends Home{

    String ownerName;

}