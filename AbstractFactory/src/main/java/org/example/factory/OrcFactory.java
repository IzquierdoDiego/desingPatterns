package org.example.factory;

import org.example.domain.Armor;
import org.example.domain.Axe;
import org.example.domain.OrcArmor;
import org.example.domain.Weapon;

public class OrcFactory implements AbstractFactory{
    @Override
    public Weapon createWeapon() {
        return new Axe();
    }

    @Override
    public Armor crateArmor() {
        return new OrcArmor();
    }
}
