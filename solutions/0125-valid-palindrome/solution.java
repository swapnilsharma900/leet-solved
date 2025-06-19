class Solution {
    public static boolean isPalindrome(String s) {
        String rev = "";
        s = s.toLowerCase();
        char ch;
        for(int i=0; i<s.length(); i++){
            ch = s.charAt(i);
            if((ch<97 || ch>122) && (ch<48 || ch>57))
                continue;
            rev += s.charAt(i);
        }
        int len = rev.length();
        for(int i=0; i<len/2; i++){
            if(rev.charAt(i) != rev.charAt(len-1-i))
                return false;
        }
        return true;
    }
}
