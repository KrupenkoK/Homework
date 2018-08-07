package HomeWork3.Humans;

import HomeWork3.Race;
import HomeWork3.StandardClasses.Warrior;

public class HumanWarrior extends Warrior {

    public HumanWarrior() {
        super(false, Race.HUMANS);
    }

    @Override
    protected int setupDamage() {
        return 18;
    }
}
