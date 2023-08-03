package pack2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
/*
    1456. Maximum Number of Vowels in a Substring of Given Length
    Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.



Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.


Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
1 <= k <= s.length
 */
public class Test {
	public static void main(String[] args) {
			
		String s = "awy";
		int count =1;
		int max =-1;
		for(int i =1;i<s.length();i++) {
			if(s.charAt(i-1) == s.charAt(i)-1) {
				count++;
			}
			else {
				max = count > max ? count : max;
				count =1;
			}
		}
		max = count > max ? count : max;
		System.out.println(max);
		
	}
}