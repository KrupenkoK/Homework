package HomeWork3.Humans;

import HomeWork3.Ability.MagicDamageSpells;
import HomeWork3.Ability.MagicSupportSpells;
import HomeWork3.Hero;
import HomeWork3.Race;

public class HumanWizard extends Hero implements MagicSupportSpells, MagicDamageSpells {

    public HumanWizard() {
        super(false, Race.HUMANS);
    }

    @Override
    public String setName(String name) {
        return super.setName("Человек Маг");
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