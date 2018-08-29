package Game.Undeads;

import Game.Ability.MeleeAttack;
import Game.Ability.ShootAttack;
import Game.Hero;
import Game.NamesOfHeroes;
import Game.Race;

public class UndeadHunter extends Hero implements ShootAttack, MeleeAttack {

    NamesOfHeroes rand = new NamesOfHeroes();

    public UndeadHunter() {
        super(false, Race.UNDEADS);
    }

    @Override
    public String setName(String name) {
        return super.setName("Охотник" + rand.readFile());
    }

    @Override
    public double meleeSkill(Hero target) {
        if (isBuffed()) {
            System.out.println("Атакует: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 4)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 4);
        }
        else {
            System.out.println("Атакует: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 2)");
            return target.setHealth(target.getHealth() - 2);
        }
    }

    @Override
    public double shootSkill(Hero target) {
        if (isBuffed() == true) {
            System.out.println("Стреляет из лука: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 8)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 8);
        }
        else {
            System.out.println("Стреляет из лука: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 4)");
            return target.setHealth(target.getHealth() - 4);
        }
    }
}

