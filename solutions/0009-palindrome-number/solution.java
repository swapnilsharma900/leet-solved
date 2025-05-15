import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        // StringBuilder sb = new StringBuilder(Integer.toString(x));
        // if(sb == sb.reverse())
        //     return true;
        // return false;

        int temp = x, last, rev = 0;
        while(temp>0){
            last = temp%10;
            rev = rev*10+last;
            temp = temp/10;
        }
        if(x == rev) return true;
        else return false;



    }
}
