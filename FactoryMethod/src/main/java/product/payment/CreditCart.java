package product.payment;

public class CreditCart implements PayMethod{

    public CreditCart(){
        System.out.println("constructor 4 " + getClass().getName() );
    }


    @Override
    public boolean pay(int amount) {

        System.out.println("making payment with credit card. value: " + amount);
        return false;
    }

    @Override
    public boolean reversePayment(int amount) {

        System.out.println("reversing payment with credit card. value: " + amount);
        return false;
    }

    @Override
    public int payOfDebt(int amount) {

        System.out.println("making deposit with credit card. value: " + amount);
        return 0;
    }
}
