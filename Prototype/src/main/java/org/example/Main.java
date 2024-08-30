package org.example;

import org.example.prototype.CreditCart;
import org.example.prototype.UsePrototype;
import org.example.prototypeExample2.PriceList;
import org.example.prototypeExample2.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        UsePrototype usePrototype = new UsePrototype();

        usePrototype.useP();

        /// example 2
        System.out.println("----------------------------------");
        createPriceListClone();

    }

    private static void createPriceListClone() {
        PriceList priceList = new PriceList("cars List");
        List<Product> productList = List.of(new Product("Mazda 3", 12214),
                                            new Product("Subaru s3", 234236),
                                            new Product("Toyota x5", 73565));
        priceList.setProductList(productList);

        PriceList newPRiceListClone = (PriceList) priceList.deepClone();

        System.out.println(priceList);
        System.out.println(newPRiceListClone);










    }
}