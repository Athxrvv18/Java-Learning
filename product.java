import java.util.*;
public class product {
    
    public static void main(String args[]){

        Scanner sc  = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println("A IS : " + a);
        int b = sc.nextInt();
        System.out.println("B  IS :" + b);

        int prod = a*b;
        System.out.println("Product of "+ a + " and " + b + " " + prod);
        

        
    }
}