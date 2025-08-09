from collections import Counter

def isAnagram(s: str, t: str) -> bool:
    if len(s) != len(t):
        return False
    return Counter(s) == Counter(t)


# Example usage
print(isAnagram("anagram", "nagaram"))  # True
print(isAnagram("rat", "car"))          # False
