from collections import Counter

class Solution:
    def firstUniqChar(self, s: str) -> int:
        # Count frequency of each character
        freq = Counter(s)
        
        # Find the first index where count is 1
        for i, ch in enumerate(s):
            if freq[ch] == 1:
                return i
        return -1

if __name__ == "__main__":
    sol = Solution()
    print(sol.firstUniqChar("leetcode"))      # Expected: 0
    print(sol.firstUniqChar("loveleetcode"))  # Expected: 2
    print(sol.firstUniqChar("aabb"))          # Expected: -1
