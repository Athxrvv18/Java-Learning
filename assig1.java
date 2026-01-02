import java.util.*;

public class assig1 {

    public static void main(String arg[]){


        Scanner sc = new Scanner(System.in);

     //   QUE 1 

        // System.out.println("ENTER A VALUE : ");
        // int a = sc.nextInt();
        // System.out.println("ENTER B VALUE : ");
        // int b = sc.nextInt();
        // System.out.println("ENTER C VALUE : ");
        // int c = sc.nextInt();
        // int avg = (a+b+c) /3;

        // System.out.println("AVG OF " + a + b + c + " is " + avg);

    // QUE 2 
     
        // System.out.println("ENTER SIDE VALUE : ");
        // float side = sc.nextFloat();
        // float area = side * side ;

        // System.out.println("AREA OF SQUARE IS "+ area);
        
    // QUE 3 

        System.out.println("ENTER COST OF PEN : ");
        float pen = sc.nextFloat();
        
        System.out.println("ENTER COST OF PENCIL : ");
        float pencil = sc.nextFloat();

        System.out.println("ENTER COST OF ERESAR : ");
        float eresar = sc.nextFloat();

        float gst = (pen+pencil+eresar ) * 18/100;

        System.out.println("TOTAL AMOUNT INCULDING GST IS : " + (pen+pencil+eresar + gst));


    }
    
}
