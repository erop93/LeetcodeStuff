package com.ReverseVowels;

import java.util.*;

public class ReverseVowels {
    public static void main(String[] args) {
        String first = "IceCreAm";
        String second = "leetcode";

        System.out.println(reverseVowels(first));
        System.out.println(reverseVowels(second));

    }

    public static String reverseVowels(String s) {
       Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u',
               'A', 'E', 'I', 'O', 'U'));

       char[] chars = s.toCharArray();
       int left = 0;
       int right = chars.length - 1;

       //iteration from left and from right
       while (left < right) {
           //finding first left vowel
           while (left < right && !vowels.contains(chars[left])) {
               left++;
           }

           //finding first right vowel
           while(left < right && !vowels.contains(chars[right])) {
               right--;
           }

           //changing left and right vowels
           if (left < right) {
               char temp = chars[left];
               chars[left]  = chars[right];
               chars[right] = temp;
               left++;
               right--;
           }
       }
       return new String(chars);
    }
}


//Given a string s, reverse only all the vowels in the string and return it.
//
//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//
//
//
//Example 1:
//
//Input: s = "IceCreAm"
//Output: "AceCreIm"
//
//Explanation:
//The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
//
//Example 2:
//
//Input: s = "leetcode"
//Output: "leotcede"
//
//
//Constraints:
//        1 <= s.length <= 3 * 105
//s consist of printable ASCII characters.


//Alternative:
// class Solution {
//    public String reverseVowels(String s) {
//        char[] word = s.toCharArray();
//        int start = 0;
//        int end = s.length() - 1;
//        String vowels = "aeiouAEIOU";
//
//        while (start < end) {
//            // Move start pointer until it points to a vowel
//            while (start < end && vowels.indexOf(word[start]) == -1) {
//                start++;
//            }
//
//            // Move end pointer until it points to a vowel
//            while (start < end && vowels.indexOf(word[end]) == -1) {
//                end--;
//            }
//
//            // Swap the vowels
//            char temp = word[start];
//            word[start] = word[end];
//            word[end] = temp;
//
//            // Move the pointers towards each other
//            start++;
//            end--;
//        }
//
//        String answer = new String(word);
//        return answer;
//    }
//}