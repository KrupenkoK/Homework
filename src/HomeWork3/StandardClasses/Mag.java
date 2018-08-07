package HomeWork3.StandardClasses;

import HomeWork3.Ability.MagicDamageSpells;
import HomeWork3.Ability.MagicSupportSpells;
import HomeWork3.Hero;
import HomeWork3.Race;

public abstract class Mag extends Hero implements MagicDamageSpells, MagicSupportSpells {

    public Mag (boolean isBuffed, Race race) {

        super(isBuffed, race);
    }

    @Override
    public int magicDamageSkill(Hero target) {
        return this.setupMagicDamage();
    }

    @Override
    public boolean magicSupportSkill(Hero target) {
        return this.setupBuff();
    }

    protected abstract int setupMagicDamage();
    protected abstract boolean setupBuff();
}
