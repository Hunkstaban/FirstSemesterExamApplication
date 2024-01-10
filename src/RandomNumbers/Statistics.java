package RandomNumbers;

import java.util.*;

public class Statistics {
    static void sortDice(ArrayList<Integer> listOfRolls) {
        Collections.sort(listOfRolls);
        System.out.println("List of rolls in ascending order: " + listOfRolls);

        Set<Integer> diceSet = new TreeSet<>(listOfRolls);
        System.out.println("\nThe following rolls appeared more than once: " + diceSet);
    }

    static void typeOfRolls(ArrayList<Integer> listOfRolls) {
        Map<Integer, Integer> histogram = new TreeMap<>();

        for (Integer rolls : listOfRolls) {
            if (histogram.containsKey(rolls)) {
                int amount = histogram.get(rolls);
                histogram.put(rolls, amount+1);
            } else {
                histogram.put(rolls, 1);
            }
        }

        int maxValue = 0;
        for (Integer value : histogram.values()) {
            if (maxValue < value) {
                maxValue = value;
            }

        }

        int maxKey = Collections.max(histogram.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.println("The amount times the different numbers on the die was rolled: " + histogram +
                "\nThe number rolled the most is: " + maxKey + " with " + maxValue + " rolls\n");

    }
}
