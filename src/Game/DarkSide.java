package Game;

import Game.Orcs.OrcArcher;
import Game.Orcs.OrcGoblin;
import Game.Orcs.OrcShaman;
import Game.Undeads.UndeadHunter;
import Game.Undeads.UndeadNecromancer;
import Game.Undeads.UndeadZombie;

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

    }
}
