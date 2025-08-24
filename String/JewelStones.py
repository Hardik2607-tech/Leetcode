def numJewelsInStones(jewels: str, stones: str) -> int:
    js = set(jewels)              # store jewels in a set for fast lookup
    return sum(ch in js for ch in stones)


# Example test cases
print(numJewelsInStones("aA", "aAAbbbb"))  # Output: 3
print(numJewelsInStones("z", "ZZ"))        # Output: 0
