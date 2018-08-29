package Game.Elfs;


import Game.Ability.MeleeAttack;
import Game.Ability.ShootAttack;
import Game.Hero;
import Game.NamesOfHeroes;
import Game.Race;

public class ElfArcher extends Hero implements MeleeAttack, ShootAttack {

    NamesOfHeroes rand = new NamesOfHeroes();

    public ElfArcher() {
        super(false, Race.ELFS);
    }

    @Override
    public String setName(String name) {
        return super.setName("Эльф лучник" + rand.readFile());
    }

    @Override
    public double shootSkill(Hero target) {
        if (this.isBuffed()) {
            System.out.println("Стреляет из лука: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 3.5)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 3.5);
        } else {
            System.out.println("Стреляет из лука: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 7)");
            return target.setHealth(target.getHealth() - 7);
        }
    }

    @Override
    public double meleeSkill(Hero target) {
        if (this.isBuffed()) {
            System.out.println("Атакует: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 1.5)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 1.5);
        } else {
            System.out.println("Атакует: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 3)");
            return target.setHealth(target.getHealth() - 3);
        }
    }
}


