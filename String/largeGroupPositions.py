def largeGroupPositions(s: str):
    res = []
    i = 0
    n = len(s)
    
    for j in range(n):
        # if it's the end of group (last char OR next char different)
        if j == n - 1 or s[j] != s[j + 1]:
            if j - i + 1 >= 3:
                res.append([i, j])
            i = j + 1  # move start to next group
    
    return res
print(largeGroupPositions("abbxxxxzzy"))       # [[3, 6]]
print(largeGroupPositions("abc"))              # []
print(largeGroupPositions("abcdddeeeeaabbbcd")) # [[3, 5], [6, 9], [12, 14]]
