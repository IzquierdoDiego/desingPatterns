package org.example.factory;

import org.example.domain.Armor;
import org.example.domain.BodyArmor;
import org.example.domain.Sword;
import org.example.domain.Weapon;

public class WarriorFactory implements AbstractFactory{
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public Armor crateArmor() {
        return new BodyArmor();
    }
}
