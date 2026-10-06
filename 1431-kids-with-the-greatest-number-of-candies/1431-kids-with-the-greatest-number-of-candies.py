class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        largestCandie = max(candies)
        result = []

        for i in range(len(candies)):
            if(candies[i] + extraCandies >= largestCandie):
                result.append(True)
            else:
                result.append(False)

        return result