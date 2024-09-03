package org.example.domain;

public class OrcArmor implements Armor{
    @Override
    public String usefulFunction() {
        return "result of the OrcArmor(ConcreteProduct) - OrcArmor implement Armor";
    }

    @Override
    public String usefulFunctionWithWeapon(Weapon collaborator) {
        String result = collaborator.usefulFunction();
        return "The result of OrcArmor(ConcreteProduct) with the " + result;
    }
}
