public class prefixSum {

    public static void main(String[] args) {

        int arr[] = { 1, -2, 6, -1, 3 };
        PrefixSum(arr);
    }

    public static void PrefixSum(int arr[]) {

        int prefix[] = new int[arr.length];
        int currSum = 0;
        int maxSub = Integer.MIN_VALUE;

        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if(maxSub < currSum){
                    maxSub = currSum;
                }
            }
        }
        System.out.println("MAX SUM OF = "+ maxSub);
    }
}
