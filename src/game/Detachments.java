package game;

import game.elfs.ElfArcher;
import game.elfs.ElfWarrior;
import game.elfs.ElfWizard;
import game.humans.HumanCrossbowman;
import game.humans.HumanWarrior;
import game.humans.HumanWizard;
import game.orcs.OrcArcher;
import game.orcs.OrcGoblin;
import game.orcs.OrcShaman;
import game.undeads.UndeadHunter;
import game.undeads.UndeadNecromancer;
import game.undeads.UndeadZombie;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Detachments {

    private Hero newElfs;
    private Hero newHumans;
    private Hero newOcrs;
    private Hero newUndeads;


    public Hero getNewElfs() {
        return newElfs;
    }

    public Hero getNewHumans() {
        return newHumans;
    }

    public Hero getNewOcrs() {
        return newOcrs;
    }

    public Hero getNewUndeads() {
        return newUndeads;
    }

    public Hero genereteElfs () {
        Random randPerson = new Random();
        List<Hero> lightElfs = new ArrayList<>();
        lightElfs.add(new ElfWizard());
        lightElfs.add(new ElfArcher());
        lightElfs.add(new ElfArcher());
        lightElfs.add(new ElfArcher());
        lightElfs.add(new ElfWarrior());
        lightElfs.add(new ElfWarrior());
        lightElfs.add(new ElfWarrior());
        lightElfs.add(new ElfWarrior());

        Hero personElfs = lightElfs.get(randPerson.nextInt(lightElfs.size()));

        if (personElfs instanceof ElfArcher) {
            newElfs = ((ElfArcher) personElfs);
        }
        if (personElfs instanceof ElfWizard) {
            newElfs = ((ElfWizard) personElfs);
        }
        if (personElfs instanceof ElfWarrior) {
            newElfs = ((ElfWarrior) personElfs);
        }
        return newElfs;
    }


    public Hero genereteOrcs () {
        Random randPerson = new Random();

        List<Hero> darkOrcs = new ArrayList<>();
        darkOrcs.add(new OrcShaman());
        darkOrcs.add(new OrcArcher());
        darkOrcs.add(new OrcArcher());
        darkOrcs.add(new OrcArcher());
        darkOrcs.add(new OrcGoblin());
        darkOrcs.add(new OrcGoblin());
        darkOrcs.add(new OrcGoblin());
        darkOrcs.add(new OrcGoblin());

        Hero personOrc = darkOrcs.get(randPerson.nextInt(darkOrcs.size()));

        if (personOrc instanceof OrcShaman) {
            newOcrs = ((OrcShaman) personOrc);
        }
        if (personOrc instanceof OrcArcher) {
            newOcrs = ((OrcArcher) personOrc);
        }
        if (personOrc instanceof OrcGoblin) {
            newOcrs = ((OrcGoblin) personOrc);
        }
        return newOcrs;
    }


    public Hero genereteHumans () {
        Random randPerson = new Random();
        List<Hero> lightHumans = new ArrayList<>();
        lightHumans.add(new HumanWizard());
        lightHumans.add(new HumanCrossbowman());
        lightHumans.add(new HumanCrossbowman());
        lightHumans.add(new HumanCrossbowman());
        lightHumans.add(new HumanWarrior());
        lightHumans.add(new HumanWarrior());
        lightHumans.add(new HumanWarrior());
        lightHumans.add(new HumanWarrior());

        Hero personHumans = lightHumans.get(randPerson.nextInt(lightHumans.size()));

        if (personHumans instanceof HumanWizard) {
            newHumans = ((HumanWizard) personHumans);
        }
        if (personHumans instanceof HumanCrossbowman) {
            newHumans = ((HumanCrossbowman) personHumans);
        }
        if (personHumans instanceof HumanWarrior) {
            newHumans = ((HumanWarrior) personHumans);
        }

        return newHumans;
    }

    public Hero genereteUndeads () {
        Random randPerson = new Random();
        List<Hero> darkUndeads = new ArrayList<>();
        darkUndeads.add(new UndeadNecromancer());
        darkUndeads.add(new UndeadHunter());
        darkUndeads.add(new UndeadHunter());
        darkUndeads.add(new UndeadHunter());
        darkUndeads.add(new UndeadZombie());
        darkUndeads.add(new UndeadZombie());
        darkUndeads.add(new UndeadZombie());
        darkUndeads.add(new UndeadZombie());

        Hero personUndead = darkUndeads.get(randPerson.nextInt(darkUndeads.size()));

        if (personUndead instanceof UndeadNecromancer) {
            newUndeads = ((UndeadNecromancer) personUndead);
        }
        if (personUndead instanceof UndeadHunter) {
            newUndeads = ((UndeadHunter) personUndead);
        }
        if (personUndead instanceof UndeadZombie) {
            newUndeads = ((UndeadZombie) personUndead);
        }
        return newUndeads;
    }

    public Hero lightSide () {
        Random randPerson = new Random();

        List<Hero> lightSide = new ArrayList<>();
        lightSide.add(genereteElfs());
        lightSide.add(genereteHumans());

        Hero personOnLightSide = lightSide.get(randPerson.nextInt(lightSide.size()));

        return personOnLightSide;
    }

    public Hero darkSide () {
        Random randPerson = new Random();

        List<Hero> darkSide = new ArrayList<>();
        darkSide.add(genereteOrcs());
        darkSide.add(genereteUndeads());

        Hero personOnDarkSide = darkSide.get(randPerson.nextInt(darkSide.size()));

        return personOnDarkSide;
    }
}
