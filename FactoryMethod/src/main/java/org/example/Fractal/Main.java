package org.example.Fractal;
import java.util.Random;

import factory.transaction.CashTransaciton;
import factory.transaction.CreditCartTransaction;
import factory.transaction.TransactionFactory;
import product.payment.Cash;
import product.payment.PayMethod;

public class Main {
    private static TransactionFactory transactionFactory;

    public static void main(String[] args) {

        System.out.println("------------------------------------------");
        int amount = generateRandomNum();
        selectTransactionWay();

        transactionFactory.crateTransactionPayment(amount);

    }

    private static void selectTransactionWay() {

        if (false) {
            transactionFactory = new CreditCartTransaction();
        } else {
            transactionFactory = new CashTransaciton();
        }

    }


    public static int generateRandomNum() {
        Random random = new Random();
        return random.nextInt(4000) + 1;
    }
}