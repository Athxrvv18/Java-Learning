import java.util.*;

public class subArray {

    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[n];

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ARRAY ELEMENTS : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sub(arr, n);
    }

    public static void sub(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
