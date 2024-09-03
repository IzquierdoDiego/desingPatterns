package org.example.domain;

public class BodyArmor implements Armor{
    @Override
    public String usefulFunction() {
        return "result of the BodyArmor(ConcreteProduct) - BodyArmor implement Armor";
    }

    @Override
    public String usefulFunctionWithWeapon(Weapon collaborator) {
        String result = collaborator.usefulFunction();
        return "The result of BodyArmor(ConcreteProduct) with the " + result;
    }
}
