class Solution(object):
    def uniquePaths(self, m, n):
        k = min(m-1, n-1)
        r = 1

        for i in range(1, k+1):
            r = r*(m+n-2-k+i)//i
        
        return r
        