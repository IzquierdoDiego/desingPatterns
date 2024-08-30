package org.example.prototype;

public class UsePrototype {

    public void useP() throws CloneNotSupportedException{
        CreditCart prototypeCart = new CreditCart("Diego", "3243-1234-6543-8763", "12/25", 453);
        CreditCart cart1 = prototypeCart.clone();
        cart1.setTitularName("steven code");

        CreditCart cart2 = prototypeCart.clone();
        cart2.setTitularName("Danna code");

        System.out.println(cart2.getTitularName());
        System.out.println(cart1.getTitularName());

    }
}
