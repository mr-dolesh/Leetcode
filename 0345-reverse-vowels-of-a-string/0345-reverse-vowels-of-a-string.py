class Solution(object):
    def reverseVowels(self, s):
        vowel = []
        for i in s:
            if i in "aeiouAEIOU":
                vowel.append(i)
        
        res = ""
        for i in s:
            if i in "aeiouAEIOU":
                res = res + vowel.pop()
            else:
                res = res + i
        
        return res