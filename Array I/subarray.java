public class subarray{

    public static void main(String[] args) {
        
        int arr[] = {10,20,30,40,50,60};
        subarray(arr);
    }

    public static void subarray(int arr[]){

        for(int i=0; i<arr.length; i++){






            
            for(int j = i+1; j<arr.length; j++){
                for(int k=0; k<arr.length; k++){
                    System.out.print("("+ arr[k] +arr[j]  +   ")" );
                }
                System.out.println();
            }
        }
    }
}