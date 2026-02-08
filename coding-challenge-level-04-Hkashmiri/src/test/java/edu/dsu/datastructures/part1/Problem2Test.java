package edu.dsu.datastructures.part1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem2Test {

    @Test
    public void missingLettersTest01() {
        Problem problem = new Problem();
        String input01 = "a b c d e f g";
        String input02 = "a c d f";

        String[] expected = new String[]{"b", "e", "g"};
        String[] actual = problem.missingLetters(input01, input02);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void missingLettersTest02() {
        Problem problem = new Problem();
        String input01 = "1 2 3 4 5 6 7 8 9 10 11 12";
        String input02 = "1 3 5 7 9 11";

        String[] expected = new String[]{"2", "4", "6", "8", "10", "12"};
        String[] actual = problem.missingLetters(input01, input02);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void missingLettersTest03() {
        Problem problem = new Problem();
        String input01 = "aa bb cc dd ee ff gg hh";
        String input02 = "aa bb dd ee hh";

        String[] expected = new String[]{"cc", "ff", "gg"};
        String[] actual = problem.missingLetters(input01, input02);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void missingLettersTest04_allCharactersInInput02() {
        Problem problem = new Problem();
        String input01 = "x y z";
        String input02 = "x y z";

        String[] expected = new String[]{};
        String[] actual = problem.missingLetters(input01, input02);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void missingLettersTest05_emptyInput02() {
        Problem problem = new Problem();
        String input01 = "m n o p q";
        String input02 = "";

        String[] expected = new String[]{"m", "n", "o", "p", "q"};
        String[] actual = problem.missingLetters(input01, input02);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void missingLettersTest06_emptyInput01() {
        Problem problem = new Problem();
        String input01 = "";
        String input02 = "a b c";

        String[] expected = new String[]{};
        String[] actual = problem.missingLetters(input01, input02);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void missingLettersTest07_numericalStrings() {
        Problem problem = new Problem();
        String input01 = "10 20 30 40 50";
        String input02 = "10 30 50";

        String[] expected = new String[]{"20", "40"};
        String[] actual = problem.missingLetters(input01, input02);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void missingLettersTest08_specialCharacters() {
        Problem problem = new Problem();
        String input01 = "@ # $ % ^";
        String input02 = "@ %";

        String[] expected = new String[]{"#", "$", "^"};
        String[] actual = problem.missingLetters(input01, input02);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void missingLettersTest09_caseSensitiveTest() {
        Problem problem = new Problem();
        String input01 = "A B C a b c";
        String input02 = "A a";

        String[] expected = new String[]{"B", "C", "b", "c"};
        String[] actual = problem.missingLetters(input01, input02);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void missingLettersTest10_duplicateCharacters() {
        Problem problem = new Problem();
        String input01 = "p p q q r r s s";
        String input02 = "p q r s";

        String[] expected = new String[]{"p", "q", "r", "s"};
        String[] actual = problem.missingLetters(input01, input02);

        Assertions.assertArrayEquals(expected, actual);
    }
}