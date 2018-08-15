package HomeWork3.Orcs;

import HomeWork3.Ability.BlackMagicSpells;
import HomeWork3.Ability.MagicDamageSpells;
import HomeWork3.Hero;
import HomeWork3.Race;

public class OrcShaman extends Hero implements BlackMagicSpells, MagicDamageSpells {

    public OrcShaman() {
        super(false, Race.ORCS);
    }

    @Override
    public String setName(String name) {
        return super.setName("Орк шаман");
    }

    @Override
    public double magicDamageSkill(Hero target) {
        if (isBuffed()) {
            System.out.println("Атакует магией: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 9)");
            setBuffed(false);
            return target.setHealth(target.getHealth() - 9);
        }
        else {
            System.out.println("Атакует магией: " + setName(getName()) + "по персонажу: " + target.setName(getName()) + " - (урон 6)");
            return target.setHealth(target.getHealth() - 6);
        }
    }

    @Override
    public boolean blackMagicSkill(Hero target) {
        System.out.println("Усиливает: " + setName(getName()) + "на персонажа: " + target.setName(getName()) + "+50% к урону");
        return target.setBuffed(true);
    }
}
