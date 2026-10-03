class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        result = []
        out = min(len(word1), len(word2))

        for i in range (out):
            result.append(word1[i])
            result.append(word2[i])

        result.append(word1[out:])
        result.append(word2[out:])

        return "".join(result)
        