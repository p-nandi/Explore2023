package arraysandstrings;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given two sorted integer arrays, return an array that combines both of them and is also sorted.
 * Input : [1,4,7,20] , [3,5,6]
 * Output: [1,2,4,5,6,7,20]
 */
public class C_MergeTwoSortedArrays {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new C_MergeTwoSortedArrays().mergeTwoSortedArrays(
                new int[] {1,4,7,20}, new int[] {3,5,6}))); // [1,3,4,5,6,7,20]
    }

    int[] mergeTwoSortedArrays(int[] nums1, int[] nums2) {
        int[]  result = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] <= nums2[j]) {
                result[k] = nums1[i];
                k++; i++;
            } else {
                result[k] = nums2[j];
                k++; j++;
            }
        }
        while(i < nums1.length) {
            result[k] = nums1[i];
            k++; i++;
        }
        while(j < nums2.length) {
            result[k] = nums2[i];
            k++; j++;
        }
        return result;
    }
}
