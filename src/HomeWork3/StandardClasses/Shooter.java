package HomeWork3.StandardClasses;

import HomeWork3.Ability.MeleeAttack;
import HomeWork3.Ability.ShootAttack;
import HomeWork3.Hero;
import HomeWork3.Race;

public abstract class Shooter extends Hero implements ShootAttack, MeleeAttack {

    public Shooter (boolean isBuffed, Race race) {

        super(isBuffed, race);
    }

    @Override
    public int shootSkill(Hero target) {
        return this.setupShot();
    }

    @Override
    public int meleeSkill(Hero target) {
        return this.setupDamage();
    }

    protected abstract int setupShot();
    protected abstract int setupDamage();
}
