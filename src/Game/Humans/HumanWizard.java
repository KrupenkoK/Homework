package Game.Humans;

import Game.Ability.MagicDamageSpells;
import Game.Ability.MagicSupportSpells;
import Game.Hero;
import Game.NamesOfHeroes;
import Game.Race;

public class HumanWizard extends Hero implements MagicSupportSpells, MagicDamageSpells {

    NamesOfHeroes rand = new NamesOfHeroes();

    public HumanWizard() {
        super(false, Race.HUMANS);
    }

    @Override
    public String setName(String name) {
        return super.setName("Человек Маг" + rand.readFile());
    }

    @Override
    public double magicDamageSkill(Hero target) {
        if (this.isBuffed()) {
            System.out.println("Атакует магией: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 2)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 2);
        }
        else {
            System.out.println("Атакует магией: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 4)");
            return target.setHealth(target.getHealth() - 4);
        }
    }

    @Override
    public double magicSupportSkill(Hero target) {
        System.out.println("Наложение улучшения от " + setName(getName()) + "на персонажа: " + target.setName(getName()) + " - (+20% )");
        return target.setHealth((target.getHealth()) + (target.getHealth() * 0.20));
    }

}