def lengthOfLastWord(s: str) -> int:
    # Remove leading and trailing spaces, then split the string
    words = s.strip().split()
    # Return the length of the last word if it exists
    return len(words[-1]) if words else 0

# Test cases
print(lengthOfLastWord("Hello World"))                # Output: 5
print(lengthOfLastWord("   fly me   to   the moon  ")) # Output: 4
print(lengthOfLastWord("luffy is still joyboy"))       # Output: 6
print(lengthOfLastWord("a "))                          # Output: 1
print(lengthOfLastWord(" "))                           # Output: 0
