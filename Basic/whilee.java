import java.util.*;

public class whilee{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

       // int counter = sc.nextInt();

        // while( counter < 10){
        //     System.out.println("HELLO WORLD");
        //     counter++;
        // }

      //  int counter = 1;

        // while(counter <=10){
        //     System.out.println(counter);
        //     counter++;
        // }

        int  n = sc.nextInt();

        // while ( counter <= n){
        //     System.out.println(counter);
        //     counter++;
        // }
        int sum = 0;
        int i=0;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}