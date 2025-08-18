def isSubsequence(s: str, t: str) -> bool:
    i, j = 0, 0  # pointers for s and t

    while i < len(s) and j < len(t):
        if s[i] == t[j]:
            i += 1
        j += 1

    return i == len(s)

print(isSubsequence("abc", "ahbgdc"))  # True
print(isSubsequence("axc", "ahbgdc"))  # False
print(isSubsequence("", "ahbgdc"))     # True (empty string is subsequence)
print(isSubsequence("abc", ""))        # False
