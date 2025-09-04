def freqAlphabets(s: str) -> str:
    res = []
    i = len(s) - 1

    while i >= 0:
        if s[i] == '#':
            # take the two digits before '#'
            num = int(s[i-2:i])
            res.append(chr(ord('a') + num - 1))
            i -= 3
        else:
            # single digit
            num = int(s[i])
            res.append(chr(ord('a') + num - 1))
            i -= 1

    return "".join(reversed(res))


# Example test cases
print(freqAlphabets("10#11#12"))  # Output: "jkab"
print(freqAlphabets("1326#"))     # Output: "acz"
print(freqAlphabets("25#"))       # Output: "y"
