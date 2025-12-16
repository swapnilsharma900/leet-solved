class Solution {
    public int search(int[] nums, int target) {
        int peak = peak(nums);
        System.out.println(peak);
        if(target < nums[0]){
            int start = peak;
            int end = nums.length-1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(nums[mid] == target) return mid;
                else if(nums[mid] < target) start = mid+1;
                else end = mid-1;
            }
        }
        else {
            int start = 0;
            int end = peak;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(nums[mid] == target) return mid;
                else if(nums[mid] < target) start = mid+1;
                else end = mid-1;
            }
        }
        return -1;
    }
    public int peak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid] < arr[start]) end = mid-1;
            else if(arr[mid] > arr[start]) start = mid;
            else return end;
        }
        return start;
    }
}
