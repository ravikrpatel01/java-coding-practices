import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String s = "abcabcbbxyz";
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        String longestSubstring = "";

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(currentChar);
            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                longestSubstring = s.substring(left, right + 1);
            }
        }

        System.out.println("Result: " + maxLen);
        System.out.println("Substring: " + longestSubstring);
    }
}
