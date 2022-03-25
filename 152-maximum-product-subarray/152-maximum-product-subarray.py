class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        maxi = nums[0]
        mini = nums[0]
        result = nums[0]
        for i in range(1, len(nums)):
            temp = maxi
            maxi = max(maxi*nums[i], mini*nums[i], nums[i])
            mini = min(temp * nums[i], mini * nums[i], nums[i])
            print(maxi)
            if maxi > result:  result = maxi
        return result
        