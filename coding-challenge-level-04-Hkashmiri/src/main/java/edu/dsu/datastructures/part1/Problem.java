package edu.dsu.datastructures.part1;

import java.util.*;

public class Problem {
    public String[] missingLetters(String input1, String input2) {
        if (input1 == null || input1.trim().isEmpty()) {
            return new String[0];
        }

        String[] array1 = input1.split(" ");
        String[] array2 = input2.split(" ");

        Map<String, Integer> input2Frequency = new HashMap<>();
        for (String s : array2) {
            input2Frequency.put(s, input2Frequency.getOrDefault(s, 0) + 1);
        }

        List<String> missing = new ArrayList<>();

        for (String s : array1) {
            if (input2Frequency.containsKey(s) && input2Frequency.get(s) > 0) {
                input2Frequency.put(s, input2Frequency.get(s) - 1);
            } else {
                missing.add(s);
            }
        }

        return missing.toArray(new String[0]);
    }
}
