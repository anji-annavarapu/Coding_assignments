package problems;
/*
    It checks Weather give word is Polindrome or not
    using two pointers problem
 */
public class Palindrome {
    public static boolean  isPalindrome(String word){
        int left=0, right=word.length()-1;
        while(left<right){
            if(word.charAt(left)!=word.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
