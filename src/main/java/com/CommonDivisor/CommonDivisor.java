package com.CommonDivisor;

public class CommonDivisor {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";

        System.out.println(gcdOfStrings(str1, str2));

    }

    public static String gcdOfStrings(String str1, String str2) {
        // If concatenated strings are not equal - return ""
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    // Это алгоритм Евклида для нахождения наибольшего общего делителя (НОД).
    // gcd(6, 3) → gcd(3, 6 % 3) → gcd(3, 0) → 3
    //
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}

//For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
//
//Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
//
//
//
//Example 1:
//
//Input: str1 = "ABCABC", str2 = "ABC"
//Output: "ABC"
//Example 2:
//
//Input: str1 = "ABABAB", str2 = "ABAB"
//Output: "AB"
//Example 3:
//
//Input: str1 = "LEET", str2 = "CODE"
//Output: ""
//
//
//Constraints:
//
//        1 <= str1.length, str2.length <= 1000
//str1 and str2 consist of English uppercase letters.