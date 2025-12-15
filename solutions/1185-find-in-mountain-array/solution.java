/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    int start, end, mid, midVal;
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        start = 0;
        end = peak;
        while(start<=end){
            mid = (start + (end-start)/2);
            midVal = mountainArr.get(mid);
            if(midVal == target)
                return mid;
            else if(target < midVal) end = mid-1;
            else start = mid+1;
        }
        start = peak+1;
        end = mountainArr.length()-1;
        while(start<=end){
            mid = (start + (end-start)/2);
            midVal = mountainArr.get(mid);
            if(midVal == target) return mid;
            else if(target < midVal) start = mid+1;
            else end = mid-1;
        }
        return -1;
    }
    public int peakIndexInMountainArray(MountainArray arr) {
        start = 0;
        end = arr.length()-1;
        mid = end/2;
        while(start<=end){
            mid = (start + (end-start)/2);
            midVal = arr.get(mid);
            if(midVal < arr.get(mid-1)) end = mid;
            else if(arr.get(mid+1) > midVal) start = mid+1;
            else return mid;
        }
        return mid;
    }
}
