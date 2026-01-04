import java.util.Scanner;

public class sumOfODD {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum;

        int evensum;
        for (int i = 1; i < num; i++) {
            if (num % 2 == 0) {
                evensum = num + i;
                System.out.println(evensum);
            }
        }
    }
}
