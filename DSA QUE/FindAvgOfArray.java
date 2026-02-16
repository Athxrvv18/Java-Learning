public class FindAvgOfArray {

    public static void main(String arg[]) {

        int arr[] = {10, 20, 30};
        System.out.println(avg(arr));
    }

    public static double avg(int arr[]) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return (double) sum / arr.length;
    }
}
