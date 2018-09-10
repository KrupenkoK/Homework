package game.undeads;

import game.ability.MeleeAttack;
import game.Hero;
import game.NamesOfHeroes;
import game.Race;

public class UndeadZombie extends Hero implements MeleeAttack {

    NamesOfHeroes rand = new NamesOfHeroes();

    public UndeadZombie(){
        super(false, Race.UNDEADS);
    }

    @Override
    public String setName(String name) {
        return super.setName("Зомби " + rand.readFile());
    }

    @Override
    public double meleeSkill(Hero target) {
        if (isBuffed() == true) {
            System.out.println("Удар копьем от: " + setName(getName()) + " по персонажу: " + target.setName(getName()) + " - (урон 36)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 36);
        }
        else {
            System.out.println("Удар копьем от: " + setName(getName()) + " по персонажу: " + target.setName(getName()) + " - (урон 18)");
            return target.setHealth(target.getHealth() - 18);
        }
    }
}
