public class revArray {

    public static void main(String[] args) {
        int n = 4;
        int arr[] = { 10, 20, 30, 40, 40 };
        int rev[] = new int[n];
        System.out.println("OG ARRAY DISPLAY : ");

        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("REVSERS ARRAY DISPLAY : ");

        for (int i = 0; i < n; i++) {
            rev[n - 1 - i] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(rev[i] + " ");
        }

    }
}
