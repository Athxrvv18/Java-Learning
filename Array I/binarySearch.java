
public class binarySearch {

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50 };

        int key = 40;

        int result = binarySearchh(arr, key);

        if (result != -1) {
            System.out.println("KEY FOUND ON : " + result);
        } else {
            System.out.println("KEY NOT FOUND!");
        }
    }

    public static int binarySearchh(int arr[], int key) {

        int start = 0;
        int end = arr.length-1 ;

        while (start <= end) {

            int mid = (start + end )/ 2;

            if (arr[mid] == key) {
                return mid;
        
            }
            if (arr[mid] < key) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
