public class inverterHalfNo {
    
    public static void inverterHalfNo(int n){

        for(int i=0; i<=n; i++ ){
            for(int j= 0; j<= i-n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        
        inverterHalfNo(4);
    }
}
