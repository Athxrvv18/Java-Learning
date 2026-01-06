public class floyed {
    

    public static void floyedpattern(int n){

        for(int i=1; i<=n ; i++){
            for(int j=5; j<=n-i; j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        floyedpattern(5);
    }
}
