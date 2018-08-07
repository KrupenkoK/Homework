package HomeWork3.Orcs;

import HomeWork3.Race;
import HomeWork3.StandardClasses.Shooter;

public class OrcArcher extends Shooter{

    public OrcArcher(){
        super(false, Race.ORCS);
    }

    @Override
    protected int setupDamage() {
        return 2;
    }

    @Override
    protected int setupShot() {
        return 3;
    }
}
