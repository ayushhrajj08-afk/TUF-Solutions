class Solution(object):
    def sortedSquares(self, nums):
        l1=[]
        for i in range(0,len(nums)):
            l1.append(nums[i]*nums[i])
        l1.sort()
        return l1
        