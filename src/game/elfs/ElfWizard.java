package game.elfs;

import game.ability.MagicDamageSpells;
import game.ability.MagicSupportSpells;
import game.Hero;
import game.NamesOfHeroes;
import game.Race;

public class ElfWizard extends Hero implements MagicSupportSpells, MagicDamageSpells {

    NamesOfHeroes rand = new NamesOfHeroes();

    public ElfWizard() {
        super(false, Race.ELFS);
    }

    @Override
    public String setName(String name) {
        return super.setName("Эльф маг "+ rand.readFile());
    }

    @Override
    public double magicDamageSkill(Hero target) {
        if (this.isBuffed()) {
            System.out.println("Атакует магией : " + setName(getName()) + " по персонажу: " + target.setName(getName()) + " - (урон 5)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 5);
        } else {
            System.out.println("Атакует магией : " + setName(getName()) + " по персонажу: " + target.setName(getName()) + " - (урон 10)");
            return target.setHealth(target.getHealth() - 10);
        }
    }

    @Override
    public double magicSupportSkill(Hero target) {
        System.out.println("Накладывает улучшение :" + setName(getName()) + " на персонажа: " + target.setName(getName()) + " - (+15%)");
        return target.setHealth((target.getHealth()) + (target.getHealth() * 0.15));
    }
}
