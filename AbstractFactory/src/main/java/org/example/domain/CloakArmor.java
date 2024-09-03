package org.example.domain;

public class CloakArmor implements Armor{
    @Override
    public String usefulFunction() {
        return "result of the CloakArmor(ConcreteProduct) - CloakArmor implement Armor";
    }

    @Override
    public String usefulFunctionWithWeapon(Weapon collaborator) {
        String result = collaborator.usefulFunction();
        return "The result of CloakArmor(ConcreteProduct) with the " + result;
    }
}
