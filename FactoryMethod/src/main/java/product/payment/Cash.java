package product.payment;

public class Cash implements PayMethod{

    public Cash(){
        System.out.println("constructor 3 " + getClass().getName() );
    }

    @Override
    public boolean pay(int amount) {

        System.out.println("making payment with cash. value: " + amount);
        return false;
    }

    @Override
    public boolean reversePayment(int amount) {

        System.out.println("reversing payment with cash. value: " + amount);
        return false;
    }

    @Override
    public int payOfDebt(int amount) {

        System.out.println("making deposit with cash. value: " + amount);
        return 0;
    }
}
