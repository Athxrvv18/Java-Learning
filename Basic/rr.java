public class rr{
    public static void main(String arg[]){

        int num = 1099;

        while(num > 0){
            int lastDigit = num % 10;
            System.out.print(lastDigit);
             num = num /10;
        }
    }
}