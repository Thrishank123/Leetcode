class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        k=k%len(nums)
        j=len(nums)-k
        nums[0:j]=nums[0:j][::-1]
        nums[j:]=nums[j:][::-1]
        nums.reverse()

        
