import java.util.*;
public class primeno {

    public static int isPrime(int n){

        int prime = 1;

        for(int i =2; i<=n-1; i++){
            if(n % i == 0){
                prime = 0;
                return prime;
            }
        }

        return prime;
    }
    // OPTIMIZED
    public static boolean isPrimeopti(int n){
        if( n == 2 ){
            return true;
        }

        for(int i=2; i<Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        

        int n = 2;
        int p = isPrime(n);

        if(p == 1){
            System.out.println("NO IS PRIME :  "+ n);

        }
        else{
            System.out.println("NOT PRIME : " + n);
        }
    
        System.out.println(isPrimeopti(4));
    //     boolean opti = isPrimeopti(n);

    //     if(opti == true){
    //         System.out.println("PRIME NO :"+ n);

    //     }
    //     else
    //     {
    //         System.out.println("NOT PRIME : "+ n);

    //     }
     }



    
}
