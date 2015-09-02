class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        if s == "":
            return 0
        lasts = s.split() # 没有参数的时候 默认参数是space
        if len(lasts) == 0: 
            return 0 
        else:
            last = lasts[len(lasts)-1]
            return len(last)