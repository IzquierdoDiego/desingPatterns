package org.example.factory;

import org.example.domain.Armor;
import org.example.domain.Weapon;

public interface AbstractFactory {

    Weapon createWeapon();
    Armor crateArmor();

}