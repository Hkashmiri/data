package edu.dsu.datastructures.part2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem2Test {

    @Test
    public void characterReplacementTest01() {
        String s = "ABAB";
        int k = 2;

        Integer expected = 4;
        Integer actual = Problem2.characterReplacement(s, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void characterReplacementTest02() {
        String s = "AABABBA";
        int k = 1;

        Integer expected = 4;
        Integer actual = Problem2.characterReplacement(s, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void characterReplacementTest03() {
        String s = "ABCDEFG";
        int k = 1;

        Integer expected = 2;
        Integer actual = Problem2.characterReplacement(s, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void characterReplacementTest04_noReplacementsNeeded() {
        String s = "AAAA";
        int k = 2;

        Integer expected = 4;
        Integer actual = Problem2.characterReplacement(s, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void characterReplacementTest05_allUniqueCharacters() {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int k = 5;

        Integer expected = 6; // Can replace 5 characters to form a longest substring of 6
        Integer actual = Problem2.characterReplacement(s, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void characterReplacementTest06_largeKValue() {
        String s = "BBBBBB";
        int k = 10; // k is larger than the string length

        Integer expected = 6;
        Integer actual = Problem2.characterReplacement(s, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void characterReplacementTest07_kEqualsZero() {
        String s = "AABBA";
        int k = 0;

        Integer expected = 2; // No replacements allowed, longest is "AA" or "BB"
        Integer actual = Problem2.characterReplacement(s, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void characterReplacementTest08_alternatingCharacters() {
        String s = "ABABABABA";
        int k = 2;

        Integer expected = 5; // Can replace two 'A's to form "BBBBB" or two 'B's to form "AAAAA"
        Integer actual = Problem2.characterReplacement(s, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void characterReplacementTest09_mixedCaseSensitivity() {
        String s = "AaAaAaA";
        int k = 2;

        Integer expected = 5; // Treats uppercase and lowercase separately, can replace two characters for a longest of 5
        Integer actual = Problem2.characterReplacement(s, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void characterReplacementTest10_singleCharacterString() {
        String s = "A";
        int k = 0;

        Integer expected = 1;
        Integer actual = Problem2.characterReplacement(s, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void characterReplacementTest11_emptyString() {
        String s = "";
        int k = 5;

        Integer expected = 0;
        Integer actual = Problem2.characterReplacement(s, k);

        Assertions.assertEquals(expected, actual);
    }
}