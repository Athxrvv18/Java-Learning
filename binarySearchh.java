public class binarySearchh {

    public static void main(String arg[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };

        int key = 4;
        int re = BinaryS(arr, key);

        if (re == -1) {
            System.out.println("KEY NOT FOUND !");
        } else {
            System.out.println("KEY FOUND ON INDEX : " + re);
        }
    }

    public static int BinaryS(int n[], int key) {

        int start = 0;
        int end = n.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (n[mid] == key) {
                return mid;
            }
            else if (n[mid] > key) {
                end = mid - 1;   // move left
            }
            else {
                start = mid + 1; // move right
            }
        }

        return -1;
    }
}
