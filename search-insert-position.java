class Solution {
    int binarySearch(int array[], int x, int low, int high) {
        while (low <= high) {
        int mid = low + (high - low) / 2;
        if (array[mid] == x)
        return mid;
        if (array[mid] < x){
            low = mid + 1;
        }
      else{
        high = mid - 1;
      }
    }
    return low;
    }
    public int searchInsert(int[] nums, int target) {
       return binarySearch(nums,target,0,nums.length-1);
    }
}
