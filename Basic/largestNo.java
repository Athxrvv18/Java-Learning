import java.util.*;

public class largestNo {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        
        System.out.println("A IS : "+ a);
        System.out.println("A IS : "+ b);
        System.out.println("A IS : "+ c);


        if( a >= b && a >= c){
            System.out.println("A IS GREATER ");
        }
        else if( b >= a && b >= c){
            System.out.println("B IS GRETER");
        }
        else { 
            System.out.println("C IS GREATER");
        }
    }
}
