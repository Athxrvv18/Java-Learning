import java.util.*;

public class prime {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean isPrime = true;

        if(num == 2){
            System.out.println("N IS PRIME");

        }
        else{
        for(int i=2; i<num-1; i++){
            if(num % 2 == 0){
                isPrime = false;
            }

           
        }

         if(isPrime == true){
                System.out.println("N IS PRIME");
            }
            else{
                System.out.println("N IS NOT PRIME");
            }
        }
    }
    
    
}
