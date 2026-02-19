public class Duplicate {

     

    public static void main(String[] args) {
        int arr[] = {10,20,10,10,10,29,39,39,49,84,10};
        duplicateEle(arr);
    }

    public static void  duplicateEle(int arr[]) {
    
      //  int dup[] = new int[arr.length];
        int count = 0;
        // for(int i=0; i<arr.length; i++){
        //     dup[i] = arr[i];
        // }
        for(int i=0; i<arr.length; i++){
             count=0;
            for(int j=i; j<arr.length; j++){
                if(arr[i] == arr[j+1] && count < 2){
                    count++;
                    System.out.println(arr[i] + "=" + count);
                }
                
               // System.out.println(arr[j] + "=" + count);
            }
        }
        
    }
}