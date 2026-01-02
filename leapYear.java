
import java.util.*;
public class leapYear {
    
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();


        if( year % 4 == 0){
            System.out.println("LEAP YEAR : " + year);
        }
        else if(year % 100 == 0){
            System.out.println("LEAP YEAR : " + year);
        }
        else if(year % 400== 0){
            System.out.println("LEAP YEAR : " + year);
        }
        else{
            System.out.println("NOT LEAP YEAR : " + year);
            
        }
    }
}
