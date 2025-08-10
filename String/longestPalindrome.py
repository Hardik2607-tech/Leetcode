from collections import Counter

def longestPalindrome(s: str) -> int:
    freq = Counter(s)
    length = 0
    odd_found = False

    for count in freq.values():
        if count % 2 == 0:
            length += count
        else:
            length += count - 1
            odd_found = True

    if odd_found:
        length += 1

    return length


# Example usage:
print(longestPalindrome("abccccdd"))  # Output: 7
print(longestPalindrome("a"))         # Output: 1
