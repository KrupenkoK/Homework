package HomeWork3.Elfs;

import HomeWork3.Race;
import HomeWork3.StandardClasses.Shooter;

public class ElfArcher extends Shooter {

    public ElfArcher() {
        super(false, Race.ELFS);
    }

    @Override
    protected int setupDamage() {
        return 3;
    }

    @Override
    protected int setupShot() {
        return 7;
    }
}
