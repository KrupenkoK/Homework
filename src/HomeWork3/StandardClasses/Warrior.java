package HomeWork3.StandardClasses;

import HomeWork3.Ability.MeleeAttack;
import HomeWork3.Hero;
import HomeWork3.Race;

public abstract class Warrior extends Hero implements MeleeAttack {

    public Warrior (boolean isBuffed, Race race) {

        super(isBuffed, race);
    }

    @Override
    public int meleeSkill(Hero target) {
        return this.setupDamage();
    }

    protected abstract int setupDamage();
}
