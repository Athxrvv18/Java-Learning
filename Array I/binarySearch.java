import java.util.*;
public class binarySearch {
    
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("ENTER ARRAY ELEMENT'S : "+arr.length);
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("ENTER KEY VALUE: ");
        int key = sc.nextInt();
        int result = bs(arr,key);
        if(result== -1){
            System.out.println("KEY NOT FOUND!");

        }
        else{
            System.out.println("KEY ON INDEX : "+ result);
        }
     }
     
     public static int bs(int arr[], int key){

        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + end / 2;

            if(arr[mid] == key){
                return mid;
            }

            if(arr[mid] < key){
                start= mid+1;
            }
            else{
                end = mid- 1;
            }
        }
        return -1;
     }
}
