package com.example.algorithms;

public class BinarySearch {
    public static void main(String[] args) {

        int nums[] = {5, 7, 9, 11, 13};
        int target = 11;

        int result = binarySearch(nums, target);
        if (result != -1) {
            System.out.println("element found at index: " + result);
        } else {
            System.out.println("element not found");
        }

        //using recursive function
        int left = 0;
        int right = nums.length-1;
        int result2 = binarySearchUsingRecurssion(nums, target, left, right);
    }

    public static int binarySearch(int[] nums, int target) {
        int steps = 0;
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            steps++;
            int mid = (left + right)/2;
            if (nums[mid] == target) {
                System.out.println("Number of steps taken by binarySearch: " + steps);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Number of steps taken by binarySearch: " + steps);
        return -1;
    }

    private static int binarySearchUsingRecurssion(int[] nums, int target, int left, int right) {
        int mid = (left + right)/2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            binarySearchUsingRecurssion(nums, target, mid + 1, right);
        } else {
            binarySearchUsingRecurssion(nums, target, left, mid - 1);
        }
        return -1;
    }

}
