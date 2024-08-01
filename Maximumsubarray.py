class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maximum=float("-inf")
        sum=0
        for i in range(len(nums)):
            sum+=nums[i]
            if sum>maximum:
                maximum=sum
            if sum < 0:
                sum=0
        return maximum
        
