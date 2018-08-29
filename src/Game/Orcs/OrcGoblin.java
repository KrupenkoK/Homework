package Game.Orcs;

import Game.Ability.MeleeAttack;
import Game.Hero;
import Game.NamesOfHeroes;
import Game.Race;

public class OrcGoblin extends Hero implements MeleeAttack {

    NamesOfHeroes rand = new NamesOfHeroes();

    public OrcGoblin() {
        super(false, Race.ORCS);
    }

    @Override
    public String setName(String name) {
        return super.setName("Гоблин" + rand.readFile());
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