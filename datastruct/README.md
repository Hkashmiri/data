# Problem Set

You will be solving the given problems below.

### Problem 01
The parameter dcHero is true if it is an DC Hero,
and the parameter avengerHero is true if the hero is an Avenger.
Avengers will assemble if it is not a DC Hero, or they're an Avenger, or there is at least an Avenger on the team.

Return true if the avengers are ready to assemble.

Example:
```java
avengersAssemble(false, false) --> true
avengersAssemble(false, true) --> true
avengersAssemble(true, false) --> false
avengersAssemble(true, true) --> true
```

### Problem 03
You and your friends are out walking on the boardwalk at Atlantic City
and decided to go to Casino for the fun of it. One person won
___ amount of money. You're trying to find out if the amount was between 90-100 or 190-200.

Return true if the amount of money is within 10 of 100 or 200.

Tip: Math.abs(num) computes the absolute value of a number.

Example:
```java
nearValue(93) --> true 
nearValue(90) --> true 
nearValue(89) --> false
```
### Problem 04
The instructor provided you with a non-empty string and a number n.
The instructor wants you to remove the letter at index n and provide a new string.

Tip: Value of n should be a valid index of a given letter in the original string,
such as 0 or str.length()-1 inclusive

Example:
```java
missingLetter("kitten", 1) --> "ktten"
missingLetter("kitten", 0) --> "itten"
missingLetter("kitten", 4) --> "kittn"
```

### Problem 05
Given the word of the day, take the last letter and
return a new word of the day when you add the last letter to the front and back of the word.
For example, "founder" yields "rfounderr".

Tip: The word of the day will be a length 1 or more

Example:
```java
wordOfDay("cat") --> "tcatt"
wordOfDay("Hello" --> "oHelloo"
wordOfDay("a") --> "aaa"
```

### Problem 06
Johnnys favorite pharse to say is hi, he wants to know if the pharses given start with "hi".
Provide Johnny with a string, and return true if the string starts with "hi" and false otherwise.

Example:
```java
beginWithHi("hi there") --> true
beginWithHi("hi") --> true
beginWithHi("hello hi") --> false
```

### Problem 07
If you think of the basic numbers 0-20, you will notice that 13-19 contain the word "teen" in them.
The math instructor provides you with 3 numbers, you need to decided if 1 or more of them contain teen.

Return true if 1 or more of them contain teen.

Example:
```java
containTeen(13, 20, 10) --> true
containTeen(20, 19, 10) --> true
containTeen(20, 10, 13) --> true
```

### Problem 08
Your local rapper is looking to create his next hook for his next track. He wants to add phrases that begin with "mix".
But he decides he wants to take it a step further and accept any phrase except the "m" can be any letter or number.
He needs your help to make sure the list of given phrases begin with what was asked.

Return true if the given phrase begins with "mix", or any beginning letter or number following "ix"

Example:
```java
startWithIx("mix snacks") --> true
startWithIx("pix snacks") --> true
startWithIx("piz snacks") --> false
```

### Problem 09
Provide two numbers, evalute both numbers to see which one is nearest to the value 10.
Some numbers may have the same range in how near they are to 10; such as 13 and 7 both are 3 from 10;
In that case, we would consider that event a tie.

Tip: Math.abs(n) returns the absolute value of a number

Return whichever number is nearest to 10, or return 0 for the event of a tie.

Example:
```java
near10(8, 13) --> 8
near10(13, 8) --> 8
near10(13, 7) --> 0
```

### Problem 10
Determine if the given string contains between 1 and 3 'e' characters.
Only if the string contains between 1 and 3 'e' characters; return true.

Example:
```java
containE("Hello") --> true
containE("Heelle") --> true
containE("Heelele") --> false
```


## Submission

Commit and push your solution to GitHub

