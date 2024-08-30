package org.example.prototypeExample2;

public class Product implements IPrototype{

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public IPrototype clone() {
        Product cloneP = new Product(name, price);
        return cloneP;
    }

    @Override
    public IPrototype deepClone() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) +  " - Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
