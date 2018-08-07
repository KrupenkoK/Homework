package HomeWork3.Orcs;

import HomeWork3.Race;
import HomeWork3.StandardClasses.Mag;

public class OrcShaman extends Mag {

    public OrcShaman() {
        super(false, Race.ORCS);
    }

    @Override
    protected boolean setupBuff() {
        return false;
    }

}
