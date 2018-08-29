package Game;

import Game.Elfs.ElfArcher;
import Game.Elfs.ElfWarrior;
import Game.Elfs.ElfWizard;
import Game.Humans.HumanCrossbowman;
import Game.Humans.HumanWarrior;
import Game.Humans.HumanWizard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BrightSide {

    public void dark() {

        ElfWarrior eWarrior = new ElfWarrior();
        ElfWizard eWizard = new ElfWizard();
        ElfArcher eArcher = new ElfArcher();

        HumanWarrior hWarrior = new HumanWarrior();
        HumanWizard hWizard = new HumanWizard();
        HumanCrossbowman hCrossbowman = new HumanCrossbowman();

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

        List<Hero> lightHumans = new ArrayList<>();
        lightHumans.add(new HumanWizard());
        lightHumans.add(new HumanCrossbowman());
        lightHumans.add(new HumanCrossbowman());
        lightHumans.add(new HumanCrossbowman());
        lightHumans.add(new HumanWarrior());
        lightHumans.add(new HumanWarrior());
        lightHumans.add(new HumanWarrior());
        lightHumans.add(new HumanWarrior());

    }
}
