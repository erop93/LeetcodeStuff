package com.CanPlaceFlowers;

public class CanPlaceFlowers {
    public static void main(String[] args) {

        int[] flowerbed = new int[]{1,0,0,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));

        int[] flowerbed2 = new int[]{1,0,0,0,1};
        int n2 = 2;
        System.out.println(canPlaceFlowers(flowerbed2, n2));

    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0)
            return true;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length - 1 || flowerbed[i+1] == 0));
            n--;
            if (n == 0)
                return true;
        }
        return false;
    }

}


//You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
//
//Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
//
//
//
//        Example 1:
//
//Input: flowerbed = [1,0,0,0,1], n = 1
//Output: true
//Example 2:
//
//Input: flowerbed = [1,0,0,0,1], n = 2
//Output: false
//
//
//Constraints:
//
//        1 <= flowerbed.length <= 2 * 104
//flowerbed[i] is 0 or 1.
//There are no two adjacent flowers in flowerbed.
//        0 <= n <= flowerbed.length