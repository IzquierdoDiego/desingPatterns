package factory.transaction;

import product.payment.CreditCart;
import product.payment.PayMethod;

public class CreditCartTransaction extends TransactionFactory{

    public CreditCartTransaction(){
        System.out.println("constructor 1 " + getClass().getName() );
    }

    @Override
    public PayMethod createTransaction() {
        return new CreditCart();
    }
}
