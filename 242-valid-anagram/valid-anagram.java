/**
# INTUITION
    sort both strings in alphbatical order then compare
# DESCRIPTION
    convert both strings to char Array
 */

import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        if(Arrays.equals(sa, ta))
            return true;
        return false;
    }
}