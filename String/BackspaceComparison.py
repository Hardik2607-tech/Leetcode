def backspaceCompare(s: str, t: str) -> bool:
    i, j = len(s) - 1, len(t) - 1
    skip_s = skip_t = 0

    while i >= 0 or j >= 0:
        # find next valid char in s
        while i >= 0:
            if s[i] == '#':
                skip_s += 1
                i -= 1
            elif skip_s > 0:
                skip_s -= 1
                i -= 1
            else:
                break

        # find next valid char in t
        while j >= 0:
            if t[j] == '#':
                skip_t += 1
                j -= 1
            elif skip_t > 0:
                skip_t -= 1
                j -= 1
            else:
                break

        # compare current chars
        ch_s = s[i] if i >= 0 else None
        ch_t = t[j] if j >= 0 else None
        if ch_s != ch_t:
            return False

        i -= 1
        j -= 1

    return True


if __name__ == "__main__":
    print(backspaceCompare("ab#c", "ad#c"))  # True
    print(backspaceCompare("ab##", "c#d#"))  # True
    print(backspaceCompare("a#c", "b"))      # False
