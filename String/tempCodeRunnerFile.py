class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        # Rotation is only possible if both strings are the same length
        if len(s) != len(goal):
            return False
        # All possible rotations of s are substrings of s+s
        return goal in (s + s)


# Example usage / test cases
if __name__ == "__main__":
    sol = Solution()
    
    # Test case 1
    s = "abcde"
    goal = "cdeab"
    print(sol.rotateString(s, goal))  # Expected: True
    
    # Test case 2
    s = "abcde"
    goal = "abced"
    print(sol.rotateString(s, goal))  # Expected: False
    
    # Test case 3
    s = "a"
    goal = "a"
    print(sol.rotateString(s, goal))  # Expected: True
    
    # Test case 4
    s = "aa"
    goal = "aa"
    print(sol.rotateString(s, goal))  # Expected: True
