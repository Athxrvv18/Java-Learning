import java.util.*;

public class charr{
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1 ; i<=n; i++){
            for(int j=i; j<= i+1; j++){ 
                System.out.print(j);

            }
            System.out.println();
        }
    }
}

// practice continued
