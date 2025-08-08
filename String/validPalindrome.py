def validPalindrome(s: str) -> bool:
    def is_palindrome_range(i, j):
        while i < j:
            if s[i] != s[j]:
                return False
            i += 1
            j -= 1
        return True

    left, right = 0, len(s) - 1
    while left < right:
        if s[left] != s[right]:
            # Try skipping either the left or the right character
            return is_palindrome_range(left + 1, right) or is_palindrome_range(left, right - 1)
        left += 1
        right -= 1
    return True

print(validPalindrome("aba"))   # True
print(validPalindrome("abca"))  # True
print(validPalindrome("abc"))   # False

