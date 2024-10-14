package com.example.algorithms;

public class LinearSearch {

    public static void main(String[] args) {

        int nums[] = {5, 7, 9, 11, 13};
        int target = 11;

        int result = linearSearch(nums, target);
        if (result != -1) {
            System.out.println("element found at index: "+result);
        } else {
            System.out.println("element not found");
        }
    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i=0; i<nums.length; i++ ) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Number of steps taken by linearSearch: " + steps);
                return i;
            }
        }
        System.out.println("Number of steps taken by linearSearch: " + steps);
        return -1;
    }
}
