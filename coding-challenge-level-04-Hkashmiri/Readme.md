# Part1: Missing Letters Coding Challenge

## Overview

In this challenge, you will implement a method to identify letters or numbers that are missing from one string (input02) compared to another (input01). The goal is to return an array containing all characters that appear in input01 but are absent in input02, while maintaining the order from input01.

### Example Scenarios

1.	Input:
      * input01 = "a b c d e f g"
      * input02 = "a c d f"

**Output: ["b", "e", "g"]**

**Explanation:** The characters “b”, “e”, and “g” are present in input01 but missing from input02.

2.	Input:
      * input01 = "1 2 3 4 5 6 7 8 9 10 11 12"
      * input02 = "1 3 5 7 9 11"
      *
      **Output: ["2", "4", "6", "8", "10", "12"]**

**Explanation:** The numbers “2”, “4”, “6”, “8”, “10”, and “12” are present in input01 but missing from input02.

### Requirements

1. **Data Structures**: Implement your solution using one of the following Java data structures:
    * List
    * Set

2. **Explanation**: Consider the advantages of each data structure when implementing your solution:
    * List: Can be useful for maintaining the order of characters from input01 while filtering out values that appear in input02.
    *	Set: Can efficiently check membership and identify elements in input01 not present in input02.

3. **Method Definition**:Implement the following method in the Problem class:

```
public List<String> findMissingLetters(String input01, String input02)
```

* **Input**: Two Strings, input01 and input02, where each string contains characters separated by a space.
* **Output**: A List of Strings representing the characters that are present in input01 but missing from input02, in the order they appear in input01.

#### Constraints
* The input strings may contain letters or numbers, separated by spaces.
* Characters are treated individually, without considering case sensitivity.
* Optimize for efficiency given potentially large inputs.

#### Approach Tips

* **List**: If you choose a List, consider iterating through input01 while checking each character against input02 to see if it is missing.
* **Set**: Using a Set for input02 enables quick lookups for missing elements from input01. This can reduce time complexity for larger strings.

#### Unit Testing

The provided test cases cover a variety of scenarios, including:

* Cases where all characters in input01 are in input02.
* Cases with multiple characters missing from input01.
* Cases with no characters missing.
* Cases with numbers and letters to ensure versatility.

Write additional test cases as needed to handle edge cases and validate robustness.

#### Final Steps

When you finish, use the following commands in the terminal to push your changes:

git add .
git commit -m "finished"
git push origin main

# Part 2: Longest Repeating Character Replacement

## Overview

In this challenge, you are given a string s and an integer k. You can change up to k characters in s to any other uppercase English character to create the longest possible substring where all characters are the same. The goal is to determine the length of the longest such substring after performing up to k replacements.

## Problem Statement

**Given:**

* A string s containing only uppercase English letters.
* An integer k representing the maximum number of character replacements allowed.

Return the length of the longest substring where all characters are identical, after modifying up to k characters.

## Example Scenarios

**Example 1**

```
Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace two 'A's with 'B's or vice versa to form "BBBB" or "AAAA".
Resulting substring length is 4.
```


**Example 2**

```
Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the 'A' in the middle with 'B' to form "AABBBBA".
The longest substring with repeating characters is "BBBB" with a length of 4.
```

### Requirements

1.	Input Constraints:
      * The string s consists only of uppercase English letters.
      * k is a non-negative integer, where 0 <= k <= s.length.
2.	Output:
      * Return an integer representing the length of the longest possible substring with all identical characters after up to k replacements.


### Edge Cases

* Consider the following edge cases:
    * k = 0: No replacements are allowed; the longest substring is the longest sequence of identical characters already present.
    * All characters the same: If all characters in s are identical, the answer is simply the length of s.
    * k >= s.length: When k is large enough to replace all characters, the answer is the length of s.

### Complexity

* Time Complexity: O(n), where n is the length of s.
* Space Complexity: O(1), as we are only storing character counts in a fixed array.
