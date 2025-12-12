class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int mid = end/2;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid] < arr[mid-1]) end = mid;
            else if(arr[mid+1] > arr[mid]) start = mid+1;
            else return mid;
        }
        return mid;
    }
}
