public class sumofall {
    
    public static void main(String[] args) {
        
        int arr[] ={ 10,20};
        System.out.println(sumOfAll(arr));
    }

    public static int sumOfAll(int arr[]){

        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+= arr[i];
        }
        return sum;

    }
}

