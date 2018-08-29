package Game.Humans;

import Game.Ability.MeleeAttack;
import Game.Hero;
import Game.NamesOfHeroes;
import Game.Race;

public class HumanWarrior extends Hero implements MeleeAttack {

    NamesOfHeroes rand = new NamesOfHeroes();

    public HumanWarrior() {
        super(false, Race.HUMANS);
    }

    @Override
    public String setName(String name) {
        return super.setName("Человек воин"+rand.readFile());
    }

    @Override
    public double meleeSkill(Hero goal) {
        if (this.isBuffed()) {
            System.out.println("Атакует мечом: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 9)");
            setBuffed(false);
            return goal.setHealth(goal.getHealth() - 9);
        }
        else {
            System.out.println("Атакует мечом: " + setName(getName()) + "по персонажу: " + goal.setName(getName()) + " - (урон 18)");
            return goal.setHealth(goal.getHealth() - 18);
        }
    }
}
