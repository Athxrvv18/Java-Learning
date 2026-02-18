import java.util.*;
public class creating2DArray{


    public static void SearchKey(int arr[][] , int key)
{
    for(int i=1; i<arr.length; i++){
        for(int j=1; j<arr[0].length; j++){
            if(arr[i][j] == key){
                System.out.println(" KEY FOUND ON " +i + j);
            }
        }
    }
}
    public static void  main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int key = 8;

        int arr[][] = new int[3][3];
        int n= arr.length; 
        int m = arr[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]= sc.nextInt();
            }
        }

          for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        SearchKey(arr, key);
        sc.close();
    }
}