class Solution {
    public boolean isPalindrome(int x) {
        if (x<0 || (x > 1 && x <= 100 && x%10 == 0))
            return false;
        StringBuffer sb = new StringBuffer(Integer.toString(x));
        if (sb.toString().equals(sb.reverse().toString()))
            return true;
        else
            return false;
    }
}

