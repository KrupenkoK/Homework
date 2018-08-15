package HomeWork3.Orcs;

import HomeWork3.Ability.MeleeAttack;
import HomeWork3.Ability.ShootAttack;
import HomeWork3.Hero;
import HomeWork3.Race;

public class OrcArcher extends Hero implements ShootAttack, MeleeAttack {

    public OrcArcher(){
        super(false, Race.ORCS);
    }

    @Override
    public String setName(String name) {
        return super.setName("Орк лучник");
    }


    @Override
    public double shootSkill(Hero target) {
        if (isBuffed() == true) {
            System.out.println("Стреляет из лука: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 6)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 6);
        }
        else {
            System.out.println("Стреляет из лука: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 3)");
            return target.setHealth(target.getHealth() - 3);
        }
    }

    @Override
    public double meleeSkill(Hero target) {
        if (isBuffed()) {
            System.out.println("Атакует клинком: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 4)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 4);
        }
        else {
            System.out.println("Атакует клинком: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 2)");
            return target.setHealth(target.getHealth() - 2);
        }
    }
}
