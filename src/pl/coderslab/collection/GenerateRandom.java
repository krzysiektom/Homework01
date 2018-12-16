package pl.coderslab.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {
    public static Map<Integer, Integer> checkRand(int amount, int interval) {
        Random random = new Random();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < amount; i++) {
            map.put(i, random.nextInt(interval));
        }
        return map;
    }
}
