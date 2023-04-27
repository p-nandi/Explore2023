package arraysandstrings;

import java.util.Arrays;

/**
 *
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 *
 */
public class E_ReverseString {

    public static void main(String[] args) {
        char[] s = new char[] {'h','e','l','l','o'};
        new E_ReverseString().reverseString(s);
        System.out.println(Arrays.toString(s)); // ["o","l","l","e","h"]
    }

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while(left < right) {
            swap(s, left, right);
            left++;
            right--;
        }
    }

    private void swap(char[] s, int left, int right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }
}
