package HomeWork3.Orcs;

import HomeWork3.Race;
import HomeWork3.StandardClasses.Warrior;

public class OrcGoblin extends Warrior {

    public OrcGoblin() {
        super(false, Race.ORCS);
    }

    @Override
    protected int setupDamage() {
        return 20;
    }
}
