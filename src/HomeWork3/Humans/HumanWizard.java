package HomeWork3.Humans;

import HomeWork3.Race;
import HomeWork3.StandardClasses.Mag;

public class HumanWizard extends Mag {

    public HumanWizard() {
        super(false, Race.HUMANS);
    }

    @Override
    protected int setupMagicDamage() {
        return 4;
    }

    @Override
    protected boolean setupBuff() {
        return false;
    }
}
