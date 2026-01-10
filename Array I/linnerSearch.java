import java.util.*;

public class linnerSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE OF ARRAY : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n; i++) {
            System.out.println("ENTER ELEMENAT OF ARRAY  : " + i);
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("ENTER KEY TO FIND");
        int key = sc.nextInt();

        int result = linnrSearch(arr, key);

        if (result == -1 ) {
            System.out.println("KEY NOT FOUND!");
        } else {
            System.out.println("KEY ON INDEX : " + result);
        }
    }

    public static int linnrSearch(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }
}