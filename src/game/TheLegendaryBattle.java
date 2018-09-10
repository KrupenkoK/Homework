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

import java.util.Random;

public class TheLegendaryBattle extends Detachments {

    Detachments genereteDetachment = new Detachments();

    Random random = new Random();
    int setRandDetachment = random.nextInt(5-1) + 1;


    public Hero targetLightSide () {
        if (setRandDetachment == 1) {
            return getNewElfs();
        }
        else if (setRandDetachment == 2) {
            return getNewElfs();
        } else if (setRandDetachment == 3) {
            return getNewHumans();
        } else if (setRandDetachment == 4) {
            return getNewHumans();
        } else
            return targetLightSide();
    }

    public Hero targetDarkSide () {
        if (setRandDetachment == 1) {
            return getNewOcrs();
        }
        else if (setRandDetachment == 2) {
            return getNewUndeads();
        } else if (setRandDetachment == 3) {
            return getNewOcrs();
        } else if (setRandDetachment == 4) {
            return getNewUndeads();
        } else
            return targetDarkSide();
    }


    public void generateSquads(){

        System.out.println(setRandDetachment);

        if (setRandDetachment == 1) {
            for (int i = 0; i < 8; i++) {
                genereteElfs();
                genereteOrcs();
            }
            System.out.println("Начинают игру - Эльфы и Орки");
            while (getNewElfs().isAlive() && getNewOcrs().isAlive()) {
                retMethodElfs();
                retMethodOrcs();
            }
            if (!getNewElfs().isAlive()) {
                System.err.println("Отряд Эльфов проиграл");
            }
            else
            {
                System.err.println("Отряд Орков проиграл");
            }
        }

        if (setRandDetachment == 2) {
            for (int i = 0; i < 8; i++) {
                genereteElfs();
                genereteUndeads();
            }
            System.out.println("Начинают игру - Эльфы и Нежить");
            while (getNewElfs().isAlive() && getNewUndeads().isAlive()) {
                retMethodElfs();
                retMethodUndeads();
            }
            if (!getNewElfs().isAlive()) {
                System.err.println("Отряд Эльфов проиграл");
            }
            else
            {
                System.err.println("Отряд Нежити проиграл");
            }
        }

        if (setRandDetachment == 3) {
            for (int i = 0; i < 8; i++) {
                genereteHumans();
                genereteOrcs();
            }
            System.out.println("Начинают игру - Люди и Орки");
            while (getNewHumans().isAlive() && getNewOcrs().isAlive()) {
                retMethodHumans();
                retMethodOrcs();
            }
            if (!getNewHumans().isAlive()) {
                System.err.println("Отряд Людей проиграл");
            }
            else
            {
                System.err.println("Отряд Орков проиграл");
            }
        }


        if (setRandDetachment == 4)
        {
            for (int i = 0; i < 8; i++) {
                genereteHumans();
                genereteUndeads();
            }
            System.out.println("Начинают игру - Люди и Нежить");
            while (getNewHumans().isAlive() && getNewUndeads().isAlive()) {
                retMethodHumans();
                retMethodUndeads();
            }
            if (!getNewHumans().isAlive()) {
                System.err.println("Отряд Людей проиграл");
            }
            else
            {
                System.err.println("Отряд Нежити проиграл");
            }
        }
    }

    public double retMethodElfs () {
        int setdetachmentElfs = random.nextInt(3-1) + 1;
        if (getNewElfs() instanceof ElfArcher) {
            switch (setdetachmentElfs) {
                case 1: {
                    return ((ElfArcher) getNewElfs()).shootSkill(targetDarkSide());
                }
                case 2: {
                    return ((ElfArcher) getNewElfs()).meleeSkill(targetDarkSide());
                }
            }
        }
        else
        if (getNewElfs() instanceof ElfWizard) {
            switch (setdetachmentElfs) {
                case 1: {
                    return ((ElfWizard) getNewElfs()).magicSupportSkill(targetLightSide());
                }
                case 2: {
                    return ((ElfWizard) getNewElfs()).magicDamageSkill(targetDarkSide());
                }
            }
        }
        if (getNewElfs() instanceof ElfWarrior) {
            return ((ElfWarrior) getNewElfs()).meleeSkill(targetDarkSide());
        }
        else
            return 0;
    }

    public Object retMethodOrcs () {
        int setdetachmentOrcs = random.nextInt(3-1) + 1;
        if (getNewOcrs() instanceof OrcArcher) {
            switch (setdetachmentOrcs) {
                case 1: {
                    return ((OrcArcher) getNewOcrs()).shootSkill(targetLightSide()); }
                case 2: {
                    return ((OrcArcher) getNewOcrs()).meleeSkill(targetLightSide());
                }
            }
        }
        else
        if (getNewOcrs() instanceof OrcShaman) {
            switch (setdetachmentOrcs) {
                case 1: {
                    return ((OrcShaman) getNewOcrs()).blackMagicSkill(targetLightSide());
                }
                case 2: {
                    return ((OrcShaman) getNewOcrs()).magicDamageSkill(targetLightSide());
                }
            }
        }
        if (getNewOcrs() instanceof OrcGoblin) {
            return ((OrcGoblin) getNewOcrs()).meleeSkill(targetLightSide());
        }
        else
            return 0;
    }

    public double retMethodHumans () {
        int setdetachmentHumans = random.nextInt(3-1) + 1;
        if (getNewHumans() instanceof HumanCrossbowman) {
            switch (setdetachmentHumans) {
                case 1: {
                    return ((HumanCrossbowman) getNewHumans()).shootSkill(targetDarkSide());
                }
                case 2: {
                    return ((HumanCrossbowman) getNewHumans()).meleeSkill(targetDarkSide());
                }
            }
        }
        else
        if (getNewHumans() instanceof HumanWizard) {
            switch (setdetachmentHumans) {
                case 1: {
                    return ((HumanWizard) getNewHumans()).magicSupportSkill(targetLightSide());
                }
                case 2: {
                    return ((HumanWizard) getNewHumans()).magicDamageSkill(targetDarkSide());
                }
            }
        }
        if (getNewHumans() instanceof HumanWarrior) {
            return ((HumanWarrior) getNewHumans()).meleeSkill(targetDarkSide());
        }
        else
            return 0;
    }

    public Object retMethodUndeads () {
        int setdetachmentUndeads = random.nextInt(3-1) + 1;
        if (getNewUndeads() instanceof UndeadHunter) {
            switch (setdetachmentUndeads) {
                case 1: {
                    return ((UndeadHunter) getNewUndeads()).shootSkill(targetLightSide());
                }
                case 2: {
                    return ((UndeadHunter) getNewUndeads()).meleeSkill(targetLightSide());
                }
            }
        }
        else
        if (getNewUndeads() instanceof UndeadNecromancer) {
            switch (setdetachmentUndeads) {
                case 1: {
                    return ((UndeadNecromancer) getNewUndeads()).blackMagicSkill(targetLightSide());
                }
                case 2: {
                    return ((UndeadNecromancer) getNewUndeads()).magicDamageSkill(targetLightSide());
                }
            }
        }
        if (getNewUndeads() instanceof UndeadZombie) {
            return ((UndeadZombie) getNewUndeads()).meleeSkill(targetLightSide());
        }
        else
            return 0;
    }

}
