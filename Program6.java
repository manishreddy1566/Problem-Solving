import java.util.HashSet;

public class LongestSubstringWithoutRepeating {

    public static int longestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(current);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "zxyzxyz";
        String s2 = "xxxx";

        System.out.println(longestSubstring(s1)); // 3
        System.out.println(longestSubstring(s2)); // 1
    }
}
