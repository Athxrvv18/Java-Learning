public class LargestNum {

    public static void main(String[] args) {
        int arr[] = { 1, 5, 7, 3, 7, 3, 2 };
        LargestNNum(arr);

    }

    public static void LargestNNum(int arr[]) {
        int largest = arr[0];
        int prev=arr[0];

        for (int i = 1; i < arr.length; i++) {

            
            if (largest <= arr[i]) {
                prev = largest;
                largest = arr[i];
                
            }

            else if(largest > prev){
                if(arr[i] != largest){
                    prev = arr[i];
                }
            }
            
        }
        System.out.println(prev);
        System.out.println(largest);
    }
}
