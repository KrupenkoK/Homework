package Game.Undeads;


import Game.Ability.BlackMagicSpells;
import Game.Ability.MagicDamageSpells;
import Game.Hero;
import Game.NamesOfHeroes;
import Game.Race;

public class UndeadNecromancer extends Hero implements MagicDamageSpells, BlackMagicSpells {

    NamesOfHeroes rand = new NamesOfHeroes();

    public UndeadNecromancer() {
        super(false, Race.UNDEADS);
    }

    @Override
    public String setName(String name) {
        return super.setName("Некромант" + rand.readFile());
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
