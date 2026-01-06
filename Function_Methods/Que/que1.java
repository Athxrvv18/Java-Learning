import java.util.*;
public class que1 {
    

    public static int avg(int a, int b,int c){

        int avg = a+b+c / 3;

        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 3;
        int c = 32;
        System.out.println("ENTER N VALUE : ");
        int n = sc.nextInt();
       // System.out.println(Sum(n));
       Sum(n);
       // System.out.println(isEven(n));
     //   palindrome(n);
       // System.out.println(avg(a, b, c));
    }


    public static boolean isEven(int n){

        if(n % 2 == 0){
            return true;
        }

        return false;

    }   

    public static void palindrome(int n){
        int rev = 0;
        int temp = n;
        while( n > 0){
            rev = rev *10+(n%10);
            n = n / 10;

        }
         if(temp == rev){
            System.out.println("N IS PALINDROME");

        }
        else{
            System.out.println("NOT PALINDROME");
        }

       
    }
    public static void Sum(int n){

        int sum = 0;

        while(n > 0){
            sum = sum + (n % 10);
            n = n / 10;
        
        }
    System.out.println(sum);
    }

}
