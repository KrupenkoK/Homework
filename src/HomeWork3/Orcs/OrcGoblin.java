package HomeWork3.Orcs;

import HomeWork3.Ability.MeleeAttack;
import HomeWork3.Hero;
import HomeWork3.Race;

public class OrcGoblin extends Hero implements MeleeAttack {

    public OrcGoblin() {
        super(false, Race.ORCS);
    }

    @Override
    public String setName(String name) {
        return super.setName("Гоблин");
    }

    @Override
    public double meleeSkill(Hero target) {
        if (isBuffed()) {
            System.out.println("Атакует дубиной: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 30)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 30);
        }
        else {
            System.out.println("Атакует дубиной: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 20)");
            return target.setHealth(target.getHealth() - 20);
        }
    }
}