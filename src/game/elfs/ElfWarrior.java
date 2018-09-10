package game.elfs;


import game.ability.MeleeAttack;
import game.Hero;
import game.NamesOfHeroes;
import game.Race;

public class ElfWarrior extends Hero implements MeleeAttack {

    NamesOfHeroes rand = new NamesOfHeroes();

    public ElfWarrior() {
        super(false, Race.ELFS);
    }

    @Override
    public String setName(String name) {
        return super.setName("Эльф воин "+ rand.readFile());
    }

    @Override
    public double meleeSkill(Hero target) {
        if (this.isBuffed()) {
            System.out.println("Атакует мечом: " + setName(getName()) + " по персонажу: " + target.setName(getName()) + " - (урон 7.5)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 7.5);
        }
        else {
            System.out.println("Атакует мечом: " + setName(getName()) + " по персонажу: " + target.setName(getName()) + " - (урон 15)");
            return target.setHealth(target.getHealth() - 15);
        }
    }
}
