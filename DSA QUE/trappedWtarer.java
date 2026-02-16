public class trappedWtarer {

    public static void main(String arg[]) {

        int arr[] = {4,2,0,3,2,5};

        System.out.println(trappedWtare(arr));
    }

    public static int trappedWtare(int arr[]) {

        int n = arr.length;
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        int rightMax[] = new int[n];
        rightMax[n - 1] = arr[n - 1];

        for (int i = n - 2; i >=0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }

        int trappedWtar = 0;
        int storeWater[] = new int[n];
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(rightMax[i], leftMax[i]);
            trappedWtar += waterLevel - arr[i];
        }

        return trappedWtar;
    }
}
