public class largestV {
    
    public static int largestV(int arr[]){

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest <arr[i]){
                largest = arr[i];
            }
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("SMALLEST VALUE IS : " + smallest);
        return largest;
    }

    public static void main(String arg[]){

        int arr[] = {1,2,3,5,6,8,3,4,5};
        System.out.println("LARGEST VALUE IS : " + largestV(arr));
    }
}
