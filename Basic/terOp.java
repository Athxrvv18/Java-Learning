import java.util.*;
public class terOp {
    public static void main(String arg[]){

        String type = 10 % 2 == 0 ? "even":"odd";
        System.out.println(type);

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER MARKS : ");
        int marks = sc.nextInt();

        String result = marks >= 35? "PASS" : "FAIL";

        System.out.println(result);
    }
}
