package edu.dsu.coding.level.beginner.problemset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    // Problem 01 Test
    @Test
    public void avengersAssembleTest01(){
        // Given
        Boolean dcHero = false;
        Boolean avengerHero = false;

        // When
        Boolean expected = true;
        Boolean actual = Problem.avengersAssemble(dcHero, avengerHero);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avengersAssembleTest02(){
        // Given
        Boolean dcHero = false;
        Boolean avengerHero = true;

        // When
        Boolean expected = true;
        Boolean actual = Problem.avengersAssemble(dcHero, avengerHero);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avengersAssembleTest03(){
        // Given
        Boolean dcHero = true;
        Boolean avengerHero = false;

        // When
        Boolean expected = false;
        Boolean actual = Problem.avengersAssemble(dcHero, avengerHero);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void avengersAssembleTest04(){
        // Given
        Boolean dcHero = true;
        Boolean avengerHero = true;

        // When
        Boolean expected = true;
        Boolean actual = Problem.avengersAssemble(dcHero, avengerHero);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    // Problem 03 Test
    @Test
    public void nearHundredTest01(){
        // Given
        int amount = 93;

        // When
        Boolean expected = true;
        Boolean actual = Problem.nearValue(amount);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nearHundredTest02(){
        // Given
        int amount = 90;

        // When
        Boolean expected = true;
        Boolean actual = Problem.nearValue(amount);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nearHundredTest03(){
        // Given
        int amount = 89;

        // When
        Boolean expected = false;
        Boolean actual = Problem.nearValue(amount);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    // Problem 04 Test
    @Test
    public void missingLetterTest01(){
        // Given
        String word = "kitten";
        int number = 1;

        // When
        String expected = "ktten";
        String actual = Problem.missingLetter(word, number);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void missingLetterTest02(){
        // Given
        String word = "kitten";
        int number = 0;

        // When
        String expected = "itten";
        String actual = Problem.missingLetter(word, number);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void missingLetterTest03(){
        // Given
        String word = "kitten";
        int number = 4;

        // When
        String expected = "kittn";
        String actual = Problem.missingLetter(word, number);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    // Problem 05 Test
    @Test
    public void wordOfDayTest01() {

        // Given
        String str = "cat";
        // When
        String expected = "tcatt";
        String actual = Problem.wordOfDay("cat");
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wordOfDayTest02() {

        // Given
        String str = "Hello";
        // When
        String expected = "oHelloo";
        String actual = Problem.wordOfDay("Hello");
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wordOfDayTest03() {

        // Given
        String str = "a";
        // When
        String expected = "aaa";
        String actual = Problem.wordOfDay("a");
        // Then
        Assertions.assertEquals(expected, actual);
    }

    // Problem 06 Test
    @Test
    public void beginWithHiTest01() {

        // Given
        String phrase = "hi there";
        // When
        Boolean expected = true;
        Boolean actual = Problem.beginWithHi(phrase);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beginWithHiTest02() {

        // Given
        String phrase = "hi";
        // When
        Boolean expected = true;
        Boolean actual = Problem.beginWithHi(phrase);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void beginWithHiTest03() {

        // Given
        String phrase = "hello hi";
        // When
        Boolean expected = false;
        Boolean actual = Problem.beginWithHi(phrase);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    // Problem 07 Test
    @Test
    public void containTeenTest01(){

        // Given
        int a = 13;
        int b = 20;
        int c = 10;

        // When
        Boolean expected = true;
        Boolean actual = Problem.containTeen(a,b,c);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void containTeenTest02(){

        // Given
        int a = 20;
        int b = 19;
        int c = 10;

        // When
        Boolean expected = true;
        Boolean actual = Problem.containTeen(a,b,c);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void containTeenTest03(){

        // Given
        int a = 20;
        int b = 10;
        int c = 13;

        // When
        Boolean expected = true;
        Boolean actual = Problem.containTeen(a,b,c);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    // Problem 08 Test
    @Test
    public void startWithIxTest01(){

        // Given
        String str = "mix snacks";

        // When
        Boolean expected = true;
        Boolean actual = Problem.startWithIx(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void startWithIxTest02(){

        // Given
        String str = "pix snacks";

        // When
        Boolean expected = true;
        Boolean actual = Problem.startWithIx(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void startWithIxTest03(){

        // Given
        String str = "piz snacks";

        // When
        Boolean expected = false;
        Boolean actual = Problem.startWithIx(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void startWithIxTest04(){

        // Given
        String str = "9ix snacks";

        // When
        Boolean expected = true;
        Boolean actual = Problem.startWithIx(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    // Problem 09 Test
    @Test
    public void near10Test01() {

        // Given
        int a = 8;
        int b = 13;
        // When
        Integer expected = 8;
        Integer actual = Problem.near10(a,b);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void near10Test02() {

        // Given
        int a = 13;
        int b = 8;
        // When
        Integer expected = 8;
        Integer actual = Problem.near10(a,b);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void near10Test03() {

        // Given
        int a = 13;
        int b = 7;
        // When
        Integer expected = 0;
        Integer actual = Problem.near10(a,b);
        // Then
        Assertions.assertEquals(expected, actual);
    }

    // Problem 10 Test
    @Test
    public void containETest01() {

        // Given
        String str = "Hello";

        // When
        Boolean expected = true;
        Boolean actual = Problem.containE(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void containETest02() {

        // Given
        String str = "Heelle";

        // When
        Boolean expected = true;
        Boolean actual = Problem.containE(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void containETest03() {

        // Given
        String str = "Heelele";

        // When
        Boolean expected = false;
        Boolean actual = Problem.containE(str);

        // Then
        Assertions.assertEquals(expected, actual);
    }


}
