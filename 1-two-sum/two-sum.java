/**
# BRUTEFORCE APPROACH: create two pointers (slow and fast) and start cheching every combination from start - O(n^2)
# INTUITION: Create a hashmap with number as a key and index as value [O(n)] then interate and use target-map[i] to find another number - (O(n))
 */
 import java.util.Map;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[] {i, map.get(target-nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}