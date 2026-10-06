class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        largestCandie = max(candies)
        result = []

        for i in range(len(candies)):
            result.append(candies[i] + extraCandies >= largestCandie)
                

        return result