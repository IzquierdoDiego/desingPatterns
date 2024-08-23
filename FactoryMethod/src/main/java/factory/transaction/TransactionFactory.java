package factory.transaction;

import product.payment.PayMethod;

import java.util.Map;

public abstract class TransactionFactory {

    public final Map<String, PayMethod> mapPayMethod;

    
    public TransactionFactory)(){

    }

    public abstract PayMethod createTransaction();

    public void crateTransactionPayment(int amount){

        amount = calculateTaxes(amount);


        PayMethod payMethodInterface = createTransaction();
        boolean paymentState = payMethodInterface.pay(amount);

    }

    private int calculateTaxes(int amount) {
        if (amount > 2000){
            return  (int) (amount + amount*0.01);
        }else{
            return amount;
        }
    }

}
