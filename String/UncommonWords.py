from collections import Counter

def uncommonFromSentences(s1: str, s2: str):
    words = s1.split() + s2.split()
    count = Counter(words)
    return [word for word in count if count[word] == 1]


# ✅ Example Test Cases
s1 = "this apple is sweet"
s2 = "this apple is sour"
print(uncommonFromSentences(s1, s2))  
# Expected: ["sweet", "sour"]

s1 = "apple apple"
s2 = "banana"
print(uncommonFromSentences(s1, s2))  
# Expected: ["banana"]
