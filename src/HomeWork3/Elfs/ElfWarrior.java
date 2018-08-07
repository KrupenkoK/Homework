package HomeWork3.Elfs;


import HomeWork3.Race;
import HomeWork3.StandardClasses.Warrior;

public class ElfWarrior extends Warrior {

    public ElfWarrior() {
        super(false, Race.ELFS);
    }

    @Override
    protected int setupDamage() {
        return 15;
    }
}
