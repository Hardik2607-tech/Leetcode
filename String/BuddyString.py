def buddyStrings(s: str, goal: str) -> bool:
    # Rule 1: Lengths must match
    if len(s) != len(goal):
        return False

    # Rule 2: If strings are equal
    if s == goal:
        # Must have at least one duplicate letter to allow a swap
        return len(set(s)) < len(s)

    # Rule 3: If strings differ
    diffs = [(a, b) for a, b in zip(s, goal) if a != b]

    # Must be exactly two mismatches and reversible
    return len(diffs) == 2 and diffs[0] == diffs[1][::-1]


# ----------------------
# Example Test Cases
# ----------------------
print(buddyStrings("ab", "ba"))   # True
print(buddyStrings("ab", "ab"))   # False
print(buddyStrings("aa", "aa"))   # True
print(buddyStrings("abcd", "abdc")) # True
print(buddyStrings("abcd", "abcd")) # False
print(buddyStrings("aaaaaaabc", "aaaaaaacb")) # True
