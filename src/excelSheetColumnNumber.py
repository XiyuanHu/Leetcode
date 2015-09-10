class Solution(object):
    def titleToNumber(self, s):
        """
        :type s: str
        :rtype: int
        """
        sum = 0
        for ss in s:
            sum = sum*26 + self.getNumber(ss)
        return sum
            
    def getNumber(self, ss):
        return ord(ss) - ord('A') + 1


    # python build in function:
    #ord(c) : Given a string of length one, 
    # return an integer representing the Unicode code
    # point of the character when the argument is a 
    # unicode object, or the value of the byte when 
    # the argument is an 8-bit string. 
    # For example, ord('a') returns the integer 97, 
    # ord(u'\u2020') returns 8224. 
    # This is the inverse of chr() for 8-bit strings 
    # and of unichr() for unicode objects. 
    # If a unicode argument is given and 
    # Python was built with UCS2 Unicode, 
    # then the character’s code point must 
    # be in the range [0..65535] inclusive; 
    # otherwise the string length is two, and a TypeError will be raised.