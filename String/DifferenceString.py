def findTheDifference(s: str, t: str) -> str:
    result = 0
    for ch in s:
        result ^= ord(ch)
    for ch in t:
        result ^= ord(ch)
    return chr(result)

# Test cases
print(findTheDifference("abcd", "abcde"))  # Output: "e"
print(findTheDifference("", "y"))          # Output: "y"
print(findTheDifference("a", "aa"))        # Output: "a"
print(findTheDifference("ae", "aea"))      # Output: "a"
