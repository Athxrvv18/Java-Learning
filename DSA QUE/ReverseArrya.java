public class ReverseArrya {
    


    public static void main(String arg[]){
        int arr[] = {1, 2, 3, 4, 5};

        reverseArrya(arr);
    }


    public static void reverseArrya(int arr[]){
       int n= arr.length;
        
        int temp[] = new int[arr.length];


        for(int i=n; i>0; i--){
            temp[i] = arr[i]; 
        }
        
        for(int i=0; i<temp.length; i++){
            System.out.println(temp[i]);
        }
        
    }
}


