package HomeWork3.Humans;

import HomeWork3.Race;
import HomeWork3.StandardClasses.Shooter;

public class HumanCrossbowman extends Shooter {

    public HumanCrossbowman() {
        super(false, Race.HUMANS);
    }

    @Override
    protected int setupDamage() {
        return 3;
    }

    @Override
    protected int setupShot() {
        return 5;
    }
}

