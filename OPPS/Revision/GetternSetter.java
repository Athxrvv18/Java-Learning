public class GetternSetter {

    public static void main(String[] args) {
        bank b1 = new deposit();
        b1.setBal(500);
       System.out.println( b1.getBal());

    }
}

class bank {

    private int balance;

   public int getBal() {
        return balance;
    }

    void setBal(int balance){
        this.balance = balance;
    }



}

class deposit extends bank{
    
    void displayBal(){
        super.setBal(getBal());
        System.out.println("BALANCE IS :" + getBal());
    }
}
