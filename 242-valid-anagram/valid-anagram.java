/**
# INTUITION
    sort both strings in alphbatical order then compare
# DESCRIPTION
    convert both strings to char Array then sort them and compare them if they are equal or not.
# OPTIMIZATION
    create 2 array of size 26 (for s and t), increment the frequency of character everytime it appears in perticular string.
    Compare both string if they are equal or not
# OPTIMIZATION 2
    create one array of size 26 and increment the frequency of character if it appears in s and decrement its frequency if it appears in t.
    Compare and if the array is empty return true
 */

import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {

        // --- APPROACH ONE ---
        // if(s.length() != t.length()) return false;
        // char[] sa = s.toCharArray();
        // char[] ta = t.toCharArray();
        // Arrays.sort(sa);
        // Arrays.sort(ta);
        // if(Arrays.equals(sa, ta))
        //     return true;
        // return false;


        // --- APPROACH TWO ---
        // int[] freqOfS = new int[26];
        // int[] freqOfT = new int[26];

        // for(int i=0; i<s.length(); i++){
        //     char ch = s.charAt(i);
        //     freqOfS[ch-97]++;
        // }
        // for(int i=0; i<t.length(); i++){
        //     char ch = t.charAt(i);
        //     freqOfT[ch-97]++;
        // }

        // if(Arrays.equals(freqOfS, freqOfT))
        //     return true;
        // return false;


        // --- APPROACH THREE ---
        if(s.length() != t.length()) return false;

        int[] freq = new int[26];
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq[ch-97]++;
            ch = t.charAt(i);
            freq[ch-97]--;
        }
        for(int i=0; i<26; i++)
            if(freq[i] != 0) return false;
        return true;

    }
}