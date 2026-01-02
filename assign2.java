import java.util.*;

public class assign2{
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        // int no = sc.nextInt();

        // String result = no>=0? "POSTIVE":"NEGITAVE";

        // System.out.println(result);

        // double temp = 103.5;

        // String result = temp >= 100? "YOU HAVE FEVER":"YOU DON'T HAVE FEVER";

        // System.out.println(result);


        System.out.println("ENTER DAY : ");
        int day = sc.nextInt();

        switch(day){

            case 1 : System.out.println("MONDAY");;
                            break;
            case 2 : System.out.println("TUESDAY");
                            break;
            case 3 : System.out.println("WENSADAY");
                            break;
            case 4 : System.out.println("THURSDAY");
                            break;
            case 5 : System.out.println("FRIDAY");
                            break;
            case 6 : System.out.println("SATURADAY");
                            break;
            case 7 : System.out.println("SUNDAY");
                            break;
            default : System.out.println("YOU LIVE IN ANOTHER UNIVERSE!");
        }

    }
}