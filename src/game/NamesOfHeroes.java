package game;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class NamesOfHeroes {

    List<String> lines = null;
    String file = "\\HomeWork\\src\\game\\names.txt";

    public String readFile () {
        try {
            lines = Files.readAllLines(Paths.get(file));
        } catch (IOException e) {
            System.err.println("File 'Names of Character' not found");
        }
        int randomIndexStr = getRandomNumber(0, lines.size());
        return lines.get(randomIndexStr);
    }

    private int getRandomNumber(int min, int max) {
        return min + (int) (Math.random() * ((max - min)));
    }

}


