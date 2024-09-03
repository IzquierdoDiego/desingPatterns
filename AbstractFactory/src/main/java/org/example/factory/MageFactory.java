package org.example.factory;

import org.example.domain.Armor;
import org.example.domain.CloakArmor;
import org.example.domain.MageFireball;
import org.example.domain.Weapon;

public class MageFactory implements AbstractFactory{
    @Override
    public Weapon createWeapon() {
        return new MageFireball();
    }

    @Override
    public Armor crateArmor() {
        return new CloakArmor();
    }
}
