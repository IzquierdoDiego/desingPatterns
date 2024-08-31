package org.example;

import org.example.prototype.CreditCart;
import org.example.prototype.UsePrototype;
import org.example.prototypeExample2.PriceList;
import org.example.prototypeExample2.Product;
import org.example.prototypeExample3.Circle;
import org.example.prototypeExample3.Rectangle;
import org.example.prototypeExample3.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        UsePrototype usePrototype = new UsePrototype();

        usePrototype.useP();

        /// example 2
        System.out.println("----------------------------------");
        createPriceListClone();
        System.out.println("----------------------------------");
        createShapeCloning();
    }

    private static void createShapeCloning() {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }

    }

    private static void createPriceListClone() {
        PriceList priceList = new PriceList("cars List");
        List<Product> productList = List.of(new Product("Mazda 3", 12214),
                                            new Product("Subaru s3", 234236),
                                            new Product("Toyota x5", 73565));
        priceList.setProductList(productList);

        PriceList newPRiceListClone = (PriceList) priceList.deepClone(); // you can try clone or deepclone
        newPRiceListClone.setName("VIP cars list");
        // logic to change VIP list prices

        System.out.println(priceList);
        System.out.println(newPRiceListClone);










    }
}