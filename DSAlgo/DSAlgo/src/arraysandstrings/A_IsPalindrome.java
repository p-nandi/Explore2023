package arraysandstrings;


/**
 *
 * Return true if a given string is a palindrome, false otherwise.
 * 1. racecar -> true
 * 2. aceba -> false
 */
public class A_IsPalindrome {

    public static void main(String[] args) {
        System.out.println(new A_IsPalindrome().isPlaindrome("racecar")); // true
        System.out.println(new A_IsPalindrome().isPlaindrome("aceba")); // false
    }

    public boolean isPlaindrome(String s) {
        int left = 0; int right = s.length() - 1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
