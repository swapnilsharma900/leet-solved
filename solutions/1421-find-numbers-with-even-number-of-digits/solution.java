class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i: nums){
            int x = (int) Math.floor(Math.log10(i))+1;
            if(x%2 == 0) count++;
        }
        return count;
    }
}
