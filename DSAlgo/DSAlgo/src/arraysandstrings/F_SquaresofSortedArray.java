package arraysandstrings;

import java.util.Arrays;

/**
 *
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 *
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares
 * of each number sorted in non-decreasing order.
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 */
public class F_SquaresofSortedArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new F_SquaresofSortedArray().sortedSquares(new int[] {-4,-1,0,3,10}))); // [0,1,9,16,100]
    }

    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        int resultIdx = nums.length - 1;

        while (left <= right) {
            int leftSqr = nums[left] * nums[left];
            int rightSqr = nums[right] * nums[right];
            if (leftSqr > rightSqr) {
                result[resultIdx] = leftSqr;
                left++;
                resultIdx--;
            } else {
                result[resultIdx] = rightSqr;
                right--;
                resultIdx--;
            }
        }
        return result;
    }
}
