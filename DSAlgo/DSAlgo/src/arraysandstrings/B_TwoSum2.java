package arraysandstrings;

/**
 *
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 *
 * Given a sorted array of unique integers and a target integer,
 * return true if there exists a pair of numbers that sum to target, false otherwise.
 *
 * For example, given nums = [1, 2, 4, 6, 8, 9, 14, 15] and target = 13, return true because 4 + 9 = 13
 */
public class B_TwoSum2 {

    public static void main(String[] args) {
        System.out.println(new B_TwoSum2().checkForTarget(new int[] {1, 2, 4, 6, 8, 9, 14, 15}, 13)); // true
    }

    public boolean checkForTarget(int[] nums, int target) {
        int left = 0; int right = nums.length - 1;
        while(left < right) {
            int sum = nums[left] + nums[right];
            if(sum == target) {
                return true;
            } else if(sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
