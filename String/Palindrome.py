def isPalindrome(s: str) -> bool:
    left, right = 0, len(s) - 1

    while left < right:
        # Skip non-alphanumeric chars
        while left < right and not s[left].isalnum():
            left += 1
        while left < right and not s[right].isalnum():
            right -= 1

        # Compare lowercase chars
        if s[left].lower() != s[right].lower():
            return False

        left += 1
        right -= 1

    return True


# Testcases
print(isPalindrome("A man, a plan, a canal: Panama"))  # True
print(isPalindrome("race a car"))                      # False
print(isPalindrome(" "))                               # True
print(isPalindrome("0P"))                              # False
