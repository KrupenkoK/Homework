package HomeWork3.Undeads;

import HomeWork3.Race;
import HomeWork3.StandardClasses.Shooter;

public class UndeadHunter extends Shooter {

    public UndeadHunter() {
        super(false, Race.UNDEADS);
    }

    @Override
    protected int setupDamage() {
        return 2;
    }

    @Override
    protected int setupShot() {
        return 4;
    }
}

