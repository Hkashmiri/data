package edu.dsu.coding.level.beginner.problemset;

public class Problem {

     /* Problem 1
    The parameter dcHero is true if it is an DC Hero,
    and the parameter avengerHero is true if the hero is an Avenger.
    Avengers will assemble if it is not a DC Hero, or they're an Avenger, or there is at least an Avenger on the team.
    Return true if the avengers are ready to assemble.
    Example:
    avengersAssemble(false, false) --> true
    avengersAssemble(false, true) --> true
    avengersAssemble(true, false) --> false
    avengersAssemble(true, true) --> true
     */

    public static Boolean avengersAssemble(boolean dcHero, boolean avengerHero) {

        return !dcHero || avengerHero;
    }

    /* Problem 3
    You and your friends are out walking on the boardwalk at Atlantic City
    and decided to go to Casino for the fun of it. One person won
    ___ amount of money. You're trying to find out if the amount was between 90-100 or 190-200.
    Return true if the amount of money is within 10 of 100 or 200.
    Tip: Math.abs(num) computes the absolute value of a number.
    nearValue(93) --> true
    nearValue(90) --> true
    nearValue(89) --> false
     */

    public static Boolean nearValue(int n) {

        return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10;
    }

     /* Problem 4
    The instructor provided you with a non-empty string and a number n.
    The instructor wants you to remove the letter at index n and provide a new string.
    Tip: Value of n should be a valid index of a given letter in the original string,
    such as 0 or str.length()-1 inclusive
    missingLetter("kitten", 1) --> "ktten"
    missingLetter("kitten", 0) --> "itten"
    missingLetter("kitten", 4) --> "kittn"
     */

    public static String missingLetter(String letter, int n) {

        return letter.substring(0, n) + letter.substring(n + 1);
    }

    /* Problem 5
    Given the word of the day, take the last letter and
    return a new word of the day when you add the last letter to the front and back of the word.
    For example, "founder" yields "rfounderr".
    Tip: The word of the day will be a length 1 or more
    wordOfDay("cat") --> "tcatt"
    wordOfDay("Hello" --> "oHelloo"
    wordOfDay("a") --> "aaa"
     */

    public static String wordOfDay(String word) {

        char lastChar = word.charAt(word.length() - 1);
        return lastChar + word + lastChar;
    }

    /* Problem 6
    Johnnys favorite pharse to say is hi, he wants to know if the pharses given start with "hi".
    Provide Johnny with a string, and return true if the string starts with "hi" and false otherwise.
    beginWithHi("hi there") --> true
    beginWithHi("hi") --> true
    beginWithHi("hello hi") --> false
     */

    public static Boolean beginWithHi(String phrase) {

        return phrase.startsWith("hi");
    }

     /* Problem 7
    If you think of the basic numbers 0-20, you will notice that 13-19 contain the word "teen" in them.
    The math instructor provides you with 3 numbers, you need to decided if 1 or more of them contain teen.
    Return true if 1 or more of them contain teen.
    containTeen(13, 20, 10) --> true
    containTeen(20, 19, 10) --> true
    containTeen(20, 10, 13) --> true
     */

    public static Boolean containTeen(int one, int two, int three){

        return (one >= 13 && one <= 19) || (two >= 13 && two <= 19) || (three >= 13 && three <= 19);
    }

    /* Problem 8
    Your local rapper is looking to create his next hook for his next track. He wants to add phrases that begin with "mix".
    But he decides he wants to take it a step further and accept any phrase except the "m" can be any letter or number.
    He needs your help to make sure the list of given phrases begin with what was asked.
    Return true if the given phrase begins with "mix", or any beginning letter or number following "ix"
    startWithIx("mix snacks") --> true
    startWithIx("pix snacks") --> true
    startWithIx("piz snacks") --> false
     */

    public static Boolean startWithIx(String phrase) {

        return phrase.startsWith("mix") || phrase.startsWith("ix");
    }

     /* Problem 9
    Provide two numbers, evalute both numbers to see which one is nearest to the value 10.
    Some numbers may have the same range in how near they are to 10; such as 13 and 7 both are 3 from 10;
    In that case, we would consider that event a tie.
    Tip: Math.abs(n) returns the absolute value of a number
    Return whichever number is nearest to 10, or return 0 for the event of a tie.
    near10(8, 13) --> 8
    near10(13, 8) --> 8
    near10(13, 7) --> 0
     */

    public static Integer near10(int one, int two){

        int distanceOne = Math.abs(one - 10);
        int distanceTwo = Math.abs(two - 10);

        if (distanceOne < distanceTwo) {
            return one;
        } else if (distanceTwo < distanceOne) {
            return two;
        } else {
            return 0;
        }
    }

    /* Problem 10
    Determine if the given string contains between 1 and 3 'e' characters.
    Only if the string contains between 1 and 3 'e' characters; return true.
    containE("Hello") --> true
    containE("Heelle") --> true
    containE("Heelele") --> false
     */

    public static Boolean containE(String str) {

        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'e') {
                count++;
            }
        }
        return count >= 1 && count <= 3;
    }

}
