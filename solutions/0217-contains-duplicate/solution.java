import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int i=0;
        while(i<nums.length){
            boolean flag = set.add(nums[i]);
            if(!flag)   return true;
            i++;
        }
        return false;
    }
}
