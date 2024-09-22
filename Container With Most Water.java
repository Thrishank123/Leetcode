class Solution {
    public int maxArea(int[] height) {
        int low=0;
        int high=height.length-1;
        int largest=0;
        while(low<=high)
        {
            int heigh=Math.min(height[low],height[high]);
            int breadth=high-low;
            largest=Math.max(largest,heigh*breadth);
            if(height[low]<height[high]) low++;
            else high--;
        }
        return largest;
    }
}   
