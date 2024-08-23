package factory.transaction;

import product.payment.Cash;
import product.payment.PayMethod;

public class CashTransaciton extends TransactionFactory{

    public CashTransaciton(){
        System.out.println("constructor 2 " + getClass().getName() );
    }

    @Override
    public PayMethod createTransaction() {
        return new Cash();
    }
}
