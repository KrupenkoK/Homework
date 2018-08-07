package HomeWork3.Elfs;

import HomeWork3.Race;
import HomeWork3.StandardClasses.Mag;

public class ElfWizard extends Mag {

    public ElfWizard() {
        super(false, Race.ELFS);
    }

    @Override
    protected int setupMagicDamage() {
        return 10;
    }

    @Override
    protected boolean setupBuff() {
        return true;
    }
}
