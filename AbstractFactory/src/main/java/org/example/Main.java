package org.example;

import org.example.domain.Armor;
import org.example.domain.Sword;
import org.example.domain.Weapon;
import org.example.factory.AbstractFactory;
import org.example.factory.MageFactory;
import org.example.factory.OrcFactory;
import org.example.factory.WarriorFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("-----------");

        System.out.println("client WarriorFcatory");
        callFactories(new MageFactory());
        System.out.println("-----------");

        System.out.println("client OrcFactory");
        callFactories(new OrcFactory());
        System.out.println("-----------");

        System.out.println("client WarriorFactory");
        callFactories(new WarriorFactory());

    }

    public static void callFactories(AbstractFactory aF){
        Weapon weapon = aF.createWeapon();
        Armor armot = aF.crateArmor();

        System.out.println(weapon.usefulFunction());
        System.out.println(armot.usefulFunction());

        System.out.println(armot.usefulFunctionWithWeapon(new Sword()));
    }


}