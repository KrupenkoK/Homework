package HomeWork3;

import HomeWork3.Orcs.OrcArcher;
import HomeWork3.Orcs.OrcGoblin;
import HomeWork3.Orcs.OrcShaman;
import HomeWork3.Undeads.UndeadHunter;
import HomeWork3.Undeads.UndeadNecromancer;
import HomeWork3.Undeads.UndeadZombie;

import java.util.ArrayList;
import java.util.List;

public class DarkSide {

    public void light(){

    OrcGoblin goblin = new OrcGoblin();
    OrcShaman shaman = new OrcShaman();
    OrcArcher oArcher = new OrcArcher();

    UndeadZombie zombie = new UndeadZombie();
    UndeadNecromancer necromancer = new UndeadNecromancer();
    UndeadHunter hunter = new UndeadHunter();

        List<Hero> darkOrcs = new ArrayList<>();
        darkOrcs.add(new OrcShaman());
        darkOrcs.add(new OrcArcher());
        darkOrcs.add(new OrcArcher());
        darkOrcs.add(new OrcArcher());
        darkOrcs.add(new OrcGoblin());
        darkOrcs.add(new OrcGoblin());
        darkOrcs.add(new OrcGoblin());
        darkOrcs.add(new OrcGoblin());

        List<Hero> darkUndeads = new ArrayList<>();
        darkOrcs.add(new UndeadNecromancer());
        darkOrcs.add(new UndeadHunter());
        darkOrcs.add(new UndeadHunter());
        darkOrcs.add(new UndeadHunter());
        darkOrcs.add(new UndeadZombie());
        darkOrcs.add(new UndeadZombie());
        darkOrcs.add(new UndeadZombie());
        darkOrcs.add(new UndeadZombie());

//        List<Hero> darkSide = new ArrayList<>();
//        darkSide.add(personOrcs);
//        darkSide.add(personUndead);
    }
}
