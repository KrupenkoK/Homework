package HomeWork3.Elfs;


import HomeWork3.Ability.MeleeAttack;
import HomeWork3.Hero;
import HomeWork3.Race;

public class ElfWarrior extends Hero implements MeleeAttack {

    public ElfWarrior() {
        super(false, Race.ELFS);
    }

    @Override
    public String setName(String name) {
        return super.setName("Эльф воин");
    }

    @Override
    public double meleeSkill(Hero target) {
        if (this.isBuffed()) {
            System.out.println("Атакует мечом: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 7.5)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 7.5);
        }
        else {
            System.out.println("Атакует мечом: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 15)");
            return target.setHealth(target.getHealth() - 15);
        }
    }
}
