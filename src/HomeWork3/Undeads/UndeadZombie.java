package HomeWork3.Undeads;

import HomeWork3.Race;
import HomeWork3.StandardClasses.Warrior;

public class UndeadZombie extends Warrior {

    public UndeadZombie(){
        super(false, Race.UNDEADS);
    }

    @Override
    protected int setupDamage() {
        return 18;
    }
}
