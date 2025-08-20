from typing import List

def stringMatching(words: List[str]) -> List[str]:
    res = []
    for i in range(len(words)):
        for j in range(len(words)):
            if i != j and words[i] in words[j]:
                res.append(words[i])
                break   # stop after first match to avoid duplicates
    return res


# ✅ Testcases
print(stringMatching(["mass","as","hero","superhero"]))   # ["as","hero"]
print(stringMatching(["leetcode","et","code"]))           # ["et","code"]
print(stringMatching(["blue","green","bu"]))              # []
