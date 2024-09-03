package org.example.domain;

public class Sword implements Weapon{
    @Override
    public String usefulFunction() {
        return "result of the Sword(ConcreteProduct) - Sword implement Weapon";
    }
}
