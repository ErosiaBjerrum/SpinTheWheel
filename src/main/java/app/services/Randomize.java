package app.services;

import java.util.List;
import java.util.Random;

public class Randomize {

    public String findRandom(List<String> valg) {
        Random random = new Random();
        return valg.get(random.nextInt(valg.size()));
    }
}