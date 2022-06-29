import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        if (first.length != second.length) {
            return false;
        }
        else {
            for (int i = 0; i < first.length; i++) {
                if (first[i] != second[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}
