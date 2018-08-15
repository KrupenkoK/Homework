package HomeWork3;

import HomeWork3.Elfs.ElfArcher;
import HomeWork3.Elfs.ElfWarrior;
import HomeWork3.Elfs.ElfWizard;
import HomeWork3.Humans.HumanCrossbowman;
import HomeWork3.Humans.HumanWarrior;
import HomeWork3.Humans.HumanWizard;

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

//        Hero personElfs = lightElfs.get(randPerson.nextInt(lightElfs.size()));
//        Hero personHumans = lightHumans.get(randPerson.nextInt(lightHumans.size()));
//
//        List<Hero> lightSide = new ArrayList<>();
//        lightSide.add(personElfs);
//        lightSide.add(personHumans);
//
//        Hero lightToStartGame = lightSide.get(randPerson.nextInt(lightSide.size()));
    }
}
