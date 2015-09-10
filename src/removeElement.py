class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        count = len(nums)-1
        for i in xrange(count+1):
            if nums[i] == val:
                while nums[count] == val and count > i:
                    count -= 1
                if count == i:
                    return count
                nums[i],nums[count] = nums[count],nums[i]
            
        return count + 1
                
        #注意xrange 和range的区别
        # range 会生成一个list, 很消耗memory, 不要用range! python3 里的range 就是2.7里的xrange 
        #当需要大量重复读取的时候，用range 比较好，因为一次读完所有的list， 而xrange 会每次重新读