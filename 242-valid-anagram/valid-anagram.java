/**
# INTUITION
    sort both strings in alphbatical order then compare
# DESCRIPTION
    convert both strings to char Array
 */

import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()) return false;
        // char[] sa = s.toCharArray();
        // char[] ta = t.toCharArray();
        // Arrays.sort(sa);
        // Arrays.sort(ta);
        // if(Arrays.equals(sa, ta))
        //     return true;
        // return false;


        // --- APPROACH TWO ---
        int[] freqOfS = new int[26];
        int[] freqOfT = new int[26];

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freqOfS[ch-97]++;
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            freqOfT[ch-97]++;
        }

        if(Arrays.equals(freqOfS, freqOfT))
            return true;
        return false;
    }
}