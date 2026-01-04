import java.util.*;

import javax.print.DocFlavor.STRING;

public class cal {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A IS VALUE : ");
        int a = sc.nextInt();
        System.out.println("ENTER  B VALUES : ");
        int b = sc.nextInt();

        char d = sc.next().charAt(0);

        switch (d) {
            case '+':
                System.out.print(a + b);
                break;
            case '-':
                System.out.print(a - b);
                break;
            case '*':
                System.out.print(a * b);
                break;
            case '/':
                System.out.print(a / b);

                break;
            case '%':
                System.out.print(a % b);

                break;
            default:
                System.out.println("ERORR");
        }
    }
}
