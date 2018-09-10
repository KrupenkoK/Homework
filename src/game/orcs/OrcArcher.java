package game.orcs;

import game.ability.MeleeAttack;
import game.ability.ShootAttack;
import game.Hero;
import game.NamesOfHeroes;
import game.Race;

public class OrcArcher extends Hero implements ShootAttack, MeleeAttack {

    NamesOfHeroes rand = new NamesOfHeroes();

    public OrcArcher(){
        super(false, Race.ORCS);
    }

    @Override
    public String setName(String name) {
        return super.setName("Орк лучник " + rand.readFile());
    }


    @Override
    public double shootSkill(Hero target) {
        if (isBuffed() == true) {
            System.out.println("Стреляет из лука: " + setName(getName()) + " по персонажу: " + target.setName(getName()) + " - (урон 6)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 6);
        }
        else {
            System.out.println("Стреляет из лука: " + setName(getName()) + " по персонажу: " + target.setName(getName()) + " - (урон 3)");
            return target.setHealth(target.getHealth() - 3);
        }
    }

    @Override
    public double meleeSkill(Hero target) {
        if (isBuffed()) {
            System.out.println("Атакует клинком: " + setName(getName()) + " по персонажу: " + target.setName(getName()) + " - (урон 4)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 4);
        }
        else {
            System.out.println("Атакует клинком: " + setName(getName()) + " по персонажу: " + target.setName(getName()) + " - (урон 2)");
            return target.setHealth(target.getHealth() - 2);
        }
    }
}
