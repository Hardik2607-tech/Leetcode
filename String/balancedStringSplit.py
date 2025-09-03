def balancedStringSplit(s: str) -> int:
    balance = 0
    count = 0
    for ch in s:
        if ch == 'R':
            balance += 1
        else:  # ch == 'L'
            balance -= 1
        if balance == 0:
            count += 1
    return count


# Example usage:
print(balancedStringSplit("RLRRLLRLRL"))  # Output: 4
print(balancedStringSplit("RLRRRLLRLL"))  # Output: 2
print(balancedStringSplit("LLLLRRRR"))    # Output: 1
