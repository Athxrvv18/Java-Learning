import java.util.*;
public class SumOfAll {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]= new int[3][3];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print( arr[i][j] + " ");
            }
        }


        System.out.println(sumofAll(arr));
        sc.close();
    }


    public static int sumofAll(int arr[][]){
        int sum = arr[0][0];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
