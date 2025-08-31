# LeetCode 1528: Shuffle String

from typing import List

def restoreString(s: str, indices: List[int]) -> str:
    # Create an array of the same length as s
    result = [""] * len(s)
    
    # Place each character at its target index
    for char, i in zip(s, indices):
        result[i] = char
    
    # Join list into final string
    return "".join(result)


# ---------- Test Cases ----------
if __name__ == "__main__":
    print(restoreString("codeleet", [4,5,6,7,0,2,1,3]))  # "leetcode"
    print(restoreString("abc", [0,1,2]))                 # "abc"
    print(restoreString("aiohn", [3,1,4,2,0]))           # "nihao"
    print(restoreString("aaiougrt", [4,0,2,6,7,3,1,5]))  # "arigatou"
