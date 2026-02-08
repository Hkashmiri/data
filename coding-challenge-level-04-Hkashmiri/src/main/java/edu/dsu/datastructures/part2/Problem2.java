package edu.dsu.datastructures.part2;

import java.util.Arrays;

public class Problem2 {
    public static Integer characterReplacement(String s, int k) {
        int[] charCounts = new int[52];
        int maxCount = 0;
        int start = 0;
        int maxLength = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            int index = getIndex(currentChar);
            charCounts[index]++;
            maxCount = Math.max(maxCount, charCounts[index]);

            while ((end - start + 1) - maxCount > k) {
                charCounts[getIndex(s.charAt(start))]--;
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    private static int getIndex(char c) {
        if (c >= 'A' && c <= 'Z') {
            return c - 'A';
        } else {
            return c - 'a' + 26;
        }
    }
}
