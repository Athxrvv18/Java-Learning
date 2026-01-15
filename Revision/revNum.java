public class revNum {
    
    public static void main(String[] args) {
        revN(123);
    }

    public static void revN(int n){

        int revserNum =  0;

        while(n >0){
            revserNum = n % 10;
            System.out.print(revserNum);
            n = n / 10;
        }
    
    }
}
