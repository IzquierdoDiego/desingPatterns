package product.payment;

public interface PayMethod {

    boolean pay(int amount);

    boolean reversePayment(int amount);

    int payOfDebt(int amount);

}
