def findLUSlength(a: str, b: str) -> int:
    if a == b:
        return -1
    return max(len(a), len(b))


# Example tests
print(findLUSlength("aba", "cdc"))  # 3
print(findLUSlength("aaa", "bbb"))  # 3
print(findLUSlength("aaa", "aaa"))  # -1
