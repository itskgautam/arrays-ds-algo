package com.kmr.app;


public class MaxConsequetiveOne {

    public static void main(String[] args) {
        //Given a binary array nums, return the maximum number of consecutive 1's in the array.

        System.out.println("-- Check  MaxConsequetiveOne --");

        int nums[]
                = { 1,1,1,1,1,0,1,1};

       System.out.println("Max Consequtive Ones  Solution 1 :: "+findMaxConsecutiveOnesSolution1(nums));
       System.out.println("Max Consequtive Ones  Solution 2 :: "+findMaxConsecutiveOnesSolution2(nums));
       System.out.println("Max Consequtive Ones  Solution 3 :: "+findMaxConsecutiveOnesSolution3(nums));
       System.out.println("Max Consequtive Ones  Solution 4 :: "+findMaxConsecutiveOnesSolution4(nums));

    }
    public static int findMaxConsecutiveOnesSolution1(int[] nums) {
        int current = 0;
        int max = 0;
        if(nums.length != 0) {
            for (int i = 0; i < nums.length; i++) {
              //  System.out.println("Looping for : "+i);
                if (nums[i] == 1) {
                    current++;
                }
                else {

                    if(current > max){
                        max = current;
                    }
                 //   System.out.println("Max is : "+max+ " , Updated Length :: " +nums.length);

                    //This will prevent looping for all the elements in the array
                    if (max > nums.length/2){

                        return max;
                    }
                    current = 0;
                }
            }
        }
        return Math.max(max, current);
    }

    public static int findMaxConsecutiveOnesSolution2(int[] nums) {
        int current = 0;
        int max = 0;
        if(nums.length != 0) {
            //A different FOR Loop
            for (int i : nums) {
              //  System.out.println("Looping for : "+i);
                if (i == 1) {
                    current++;
                }
                else {

                    if(current > max){
                        max = current;
                    }
                  //  System.out.println("Max is : "+max+ " , Updated Length :: " +nums.length);
                    //This will prevent looping for all the elements in the array
                    if (max > nums.length/2){

                        return max;
                    }
                    current = 0;
                }
            }
        }
        return Math.max(max, current);
    }

// This solution loops for all the elements
        public static int findMaxConsecutiveOnesSolution3(int[] nums) {
            int maxLength = 0;
            int currentLength = 0;
            for (int i = 0; i < nums.length; i++) {
               // System.out.println("Looping for : "+i);
                if (nums[i] == 1) {
                    currentLength++;
                }
                else {
                    maxLength = Math.max(maxLength, currentLength);
                    currentLength = 0;
                }
            }

            return  Math.max(maxLength, currentLength);
        }



    // This solution loops for all the elements
    public static int findMaxConsecutiveOnesSolution4(int[] nums) {
        int maxLength = 0;
        int currentLength = 0;
        for (int i : nums) {
            // System.out.println("Looping for : "+i);
            currentLength = i == 0 ? 0 : currentLength+1;
            maxLength = Math.max(maxLength, currentLength);
        }

        return  maxLength;
    }

}
