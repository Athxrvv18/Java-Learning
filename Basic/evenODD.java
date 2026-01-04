import java.util.*;

public class evenODD {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt();


        if(val % 2 == 0){
            System.out.println("VALUE IS EVEN");
        }
        else{
            System.out.println("VALUE IS ODD");
        }

        if(val >= 18){
            System.out.println("ADULT");
        }
        else if( val >= 13 && val < 18){
            System.out.println("CHILDERN");
        }
        else{
            System.out.println("KID");
        }
    }
}
