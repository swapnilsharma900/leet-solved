class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0,n = letters.length , end = n;
        if(target>letters[n-1] || target==letters[n-1]) 
            return letters[0];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(letters[mid]==target && letters[mid]!=letters[mid+1]) 
                return letters[mid+1];
            else if(letters[mid] > target) end = mid-1;
            else start = mid+1;
        }
        return letters[start];
    }
}
