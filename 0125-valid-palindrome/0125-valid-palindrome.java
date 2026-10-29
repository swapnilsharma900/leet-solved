/**
INTUITIONS: Iterate over the given string using two pointers(start & end) and check if each character matches to their corresponding once, ignore character if it is not a digit or alphabet. 

ALGORITHM: 
    1. condition: if(len ==0 || len ==1) return true;
    2. vars: start=0; end=len-1;
    3. loop: while(start<end) -> 
        i. condition: if(startChar != letterOrDigit) -> start++;
        ii.           else if(endChar != letterOrDigit) -> end--;
        iii.          else -> if(lowerCase(startChar) != lowerCase(endChar)) -> return false;
                              start++; end--;
    4. return true;

COMPLEXITY: Time = O(n) Space = O(1)
 */
class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty() || s.length() == 1) return true;

        int start = 0;
        int end = s.length()-1;
        while(start <= end) {
        	if (!Character.isLetterOrDigit(s.charAt(start) )) start++;
        	else if(!Character.isLetterOrDigit(s.charAt(end))) end--;
        	else {
        		if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) return false;
        		start++;
        		end--;
        	}
        }
        return true;
    }
}
