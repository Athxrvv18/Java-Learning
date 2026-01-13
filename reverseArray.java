public class reverseArray {
    
    public static void main(String[] args) {
        int arr[]= { 1,2,3,4,5,6};

        swap(arr);

        for(int i=1; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }  


     public static void swap(int n[]){

        int start = 0, end = n.length-1;

        while(start < end){
            int temp = n[end];
            n[end] = n[start];
            n[start] = temp;


            start++;
            end--;
        }

        
     }
}
