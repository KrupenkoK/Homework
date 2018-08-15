package HomeWork3.Undeads;


import HomeWork3.Ability.BlackMagicSpells;
import HomeWork3.Ability.MagicDamageSpells;
import HomeWork3.Hero;
import HomeWork3.Race;

public class UndeadNecromancer extends Hero implements MagicDamageSpells, BlackMagicSpells {

    public UndeadNecromancer() {
        super(false, Race.UNDEADS);
    }

    @Override
    public String setName(String name) {
        return super.setName("Некромант");
    }

    @Override
    public boolean blackMagicSkill(Hero target) {
        System.out.println("Насылает недуг: " + setName(getName()) + "на персонажа: " + target.setName(getName()) + " -50% от урона");
        return target.setBuffed(true);
    }

    @Override
    public double magicDamageSkill(Hero target) {
        if (this.isBuffed()) {
            System.out.println("Атакует магией: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 5)");
            return target.setHealth(target.getHealth() - 5);
        } else {
            System.out.println("Атакует магией: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 10)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 10);
        }
    }
}
