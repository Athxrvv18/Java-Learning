import java.util.*;

public class LargestNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
System.out.println();
            
        }
        sc.close();

        System.out.println("LARGEST NO IS : " + LargestEle(arr));
    }

    public static int LargestEle(int arr[][]) {
        int largest = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                }
            }
        }
        return largest;
    }

}
