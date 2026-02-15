public class PraticeQue {

    public static void main(String[] args) {
        
        child c1 = new child();
        c1.care();
        c1.money();
    }


}


interface Father{

    void money();
}

interface Mother{

    void care();
}


class child implements Father , Mother{

    public void money(){
        System.out.println("FATHER GIVES MONEY!");
    }

    public void care(){
        System.out.println("MOTHER TAKE CARESS!");
    }
}
