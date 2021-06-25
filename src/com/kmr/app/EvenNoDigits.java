package com.kmr.app;

public class EvenNoDigits {

    public static void main(String[] args) {
        //Given an array nums of integers, return how many of them contain an even number of digits.
        /*Input: nums = [555,901,482,1771]
         *Only 1771 contains an even number of digits.
         *Output: 1
         * */
        System.out.println("-- Check  EvenNoDigits --");

        int nums[] = {555222,9012,482,1771};
       System.out.println("No of Even Digits are "+ findNumbers(nums));

    }

    public static int findNumbers(int[] nums){
        int evenOnes = 0;
        int currentLength = 0;
        for(int i: nums){
            evenOnes += String.valueOf(i).length() % 2 == 0 ? 1 : 0;

        }

        return evenOnes;
    }
}
