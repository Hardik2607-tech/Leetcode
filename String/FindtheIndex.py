def strStr(haystack: str, needle: str) -> int:
    n, m = len(haystack), len(needle)

    if m == 0:
        return 0

    for i in range(n - m + 1):
        if haystack[i:i+m] == needle:
            return i

    return -1


# ---- Testcases ----
print(strStr("sadbutsad", "sad"))   # Output: 0
print(strStr("leetcode", "leeto"))  # Output: -1
print(strStr("hello", "ll"))        # Output: 2
print(strStr("aaaaa", "bba"))       # Output: -1
print(strStr("", ""))               # Output: 0
