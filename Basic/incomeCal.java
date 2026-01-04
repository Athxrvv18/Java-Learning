import java.util.*;

public class incomeCal {
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        double tax;
        System.out.println("YOUR INCOME IS : "+ income);

        if( income <= 500000 ){
            System.out.println("NOT TAX");
        }
        else if( income >= 500000 && income <= 1000000){
            tax = income *(0.2);
            System.out.println("TAX ON INCOME IS = 20% \n TOTAL INCOME TAX : "+ tax);
        }
        else {
            tax = income * (0.3);
            System.out.println("TAX ON INCOME IS = 30%\n TOTAL TAX : "+ tax);
        }

    }
}
