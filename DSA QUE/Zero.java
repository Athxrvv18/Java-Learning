public class Zero {
   
    
    public static void main(String[] args) {
        int arr[] = { 1,0,0,9,5,8};
        zeroMove(arr);

        

    }

    public static void zeroMove(int arr[]){
        int temp;
        for(int i=0; i<arr.length; i++){
int count = 1;
            if(arr[i] == 0){
                count++;
                temp = arr[i];
                arr[i] = arr[arr.length-1];
                arr[arr.length-1] = temp;
                temp =0;
            }
        }
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
        }

    }
}


