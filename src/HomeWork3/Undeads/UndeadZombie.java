package HomeWork3.Undeads;

import HomeWork3.Ability.MeleeAttack;
import HomeWork3.Hero;
import HomeWork3.Race;

public class UndeadZombie extends Hero implements MeleeAttack {

    public UndeadZombie(){
        super(false, Race.UNDEADS);
    }

    @Override
    public String setName(String name) {
        return super.setName("Зомби");
    }

    @Override
    public double meleeSkill(Hero target) {
        if (isBuffed() == true) {
            System.out.println("Удар копьем от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 36)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 36);
        }
        else {
            System.out.println("Удар копьем от: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 18)");
            return target.setHealth(target.getHealth() - 18);
        }
    }
}
