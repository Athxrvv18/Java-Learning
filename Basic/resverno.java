public class resverno {
    

    public static void main(String[] args) {
        
        int no = 1099;

        while(no > 0){

            int lastDigit = no%10;
            System.out.print(lastDigit);
            no= no/10;

        }
        System.out.print("");
    }
}
