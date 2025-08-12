def repeatedSubstringPattern(s: str) -> bool:
    return s in (s + s)[1:-1]

 
print(repeatedSubstringPattern("abab"))       # True
print(repeatedSubstringPattern("aba"))        # False
print(repeatedSubstringPattern("abcabcabc"))  # True
