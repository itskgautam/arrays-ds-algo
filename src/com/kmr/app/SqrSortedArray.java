package com.kmr.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SqrSortedArray {
    public static void main(String[] args) {
        System.out.println("-- Return Square of Sorted Array--");

        int nums[] = {-7,-3,2,3,11};

        System.out.println("Squares Sorted array 1 ::  "+ Arrays.toString(sortedSquares(nums)));
        System.out.println("Squares Sorted array 2 ::  "+ Arrays.toString(sortedSquaresSol2(nums)));
        System.out.println("Squares Sorted array 3 ::  "+ Arrays.toString(sortedSquaresSol3(nums)));
        System.out.println("Squares Sorted array 4 ::  "+ Arrays.toString(sortedSquaresSol4(nums)));

    }

    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[nums.length];

        int n = nums.length;
        for(int i = n - 1; i >=0; i--){
            int square = 0;
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                square = nums[left++];
            }else{
                square = nums[right--];
            }
            res[i] = square * square;
        }
        return res;
    }

    public static int[] sortedSquaresSol2(int[] nums) {

        List<Integer> list = new ArrayList<Integer>();
        for (int i:nums){
            list.add(i*i);
        }
        int squarednums[] = new int[list.size()];
        int j=0;
        for (Integer ele: list){
            squarednums[j++]=ele;
        }
        Arrays.sort(squarednums);

        return squarednums;
    }

    public static int[] sortedSquaresSol3(int[] nums){
        int[] numscopy = Arrays.copyOf(nums,nums.length);
        for(int i=0;i<numscopy.length;i++){
            numscopy[i]= numscopy[i]*numscopy[i];

        }
       // Arrays.sort(nums);
        Arrays.parallelSort(numscopy);
        return numscopy;
    }

    public static int[] sortedSquaresSol4(int[] nums){
        nums =Arrays.stream(nums).map(i -> i*i).sorted().toArray();
        return nums;
    }





}
