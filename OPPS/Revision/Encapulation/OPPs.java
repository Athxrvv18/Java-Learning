public class OPPs {

    public static void main(String arg[]) {
        bankAc b1 = new bankAc();
        b1.deposite(5000);
        b1.balance();
        b1.deposite(400);
        b1.balance();

    }
}

class bankAc {

    String acName;
    private int balance;

    public void deposite(int anmount) {
        if (anmount > 0) {
            updateBal(anmount);
        } else {
            System.out.println("INVAILD AMOUNT ");
        }

    }

    public void balance() {
        System.out.println("BALANCE IS : " + balance);

    }

    private void updateBal(int amount) {
        balance += amount;

        System.out.println("UPDATED BALANCE IS : " + balance);
    }

}