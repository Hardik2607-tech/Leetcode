def removeDuplicates(s: str) -> str:
    stack = []
    for ch in s:
        if stack and stack[-1] == ch:
            stack.pop()  # remove duplicate
        else:
            stack.append(ch)
    return "".join(stack)


# ✅ Testcases
print(removeDuplicates("abbaca"))   # Output: "ca"
print(removeDuplicates("azxxzy"))   # Output: "ay"
print(removeDuplicates("a"))        # Output: "a"
print(removeDuplicates("aa"))       # Output: ""
print(removeDuplicates("abba"))     # Output: ""
print(removeDuplicates("abcddcba")) # Output: ""
