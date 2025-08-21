from math import gcd

def gcdOfStrings(str1: str, str2: str) -> str:
    # If concatenations don't match, no common divisor string exists
    if str1 + str2 != str2 + str1:
        return ""
    # The gcd of the lengths tells us the largest divisor length
    k = gcd(len(str1), len(str2))
    return str1[:k]


print(gcdOfStrings("ABCABC", "ABC"))    # "ABC"
print(gcdOfStrings("ABABAB", "ABAB"))   # "AB"
print(gcdOfStrings("AAAAAA", "AAA"))    # "AAA"
print(gcdOfStrings("A", "A"))           # "A"
print(gcdOfStrings("LEET", "CODE"))     # ""
