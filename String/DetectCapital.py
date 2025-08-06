def detectCapitalUse(word: str) -> bool:
    return word.isupper() or word.islower() or word.istitle()

# Test cases
print(detectCapitalUse("USA"))       # True
print(detectCapitalUse("FlaG"))      # False
print(detectCapitalUse("Google"))    # True
print(detectCapitalUse("leetcode"))  # True
