package HomeWork3.Humans;

import HomeWork3.Ability.MeleeAttack;
import HomeWork3.Ability.ShootAttack;
import HomeWork3.Hero;
import HomeWork3.Race;

public class HumanCrossbowman extends Hero implements MeleeAttack, ShootAttack {

    public HumanCrossbowman() {
        super(false, Race.HUMANS);
    }

    @Override
    public String setName(String name) {
        return super.setName("Человек арбалетчик");
    }

    @Override
    public double shootSkill(Hero target) {
        if (this.isBuffed()) {
            System.out.println("Стреляет из арбалета: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 2.5)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 2.5);
        }
        else {
            System.out.println("Стреляет из арбалета: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 5)");
            return target.setHealth(target.getHealth() - 5);
        }
    }

    @Override
    public double meleeSkill(Hero target) {
        if (this.isBuffed()) {
            System.out.println("Атакует: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 1.5)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 1.5);
        }
        else {
            System.out.println("Атакует: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 3)");
            return target.setHealth(target.getHealth() - 3);
        }
    }
}

