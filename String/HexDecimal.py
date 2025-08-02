def HexDecimal(num):
    if num == 0:
        return "0"

    hex_chars = "0123456789abcdef"
    result = []

    # simulate 32-bit unsigned integer
    num &= 0xFFFFFFFF

    while num > 0:
        result.append(hex_chars[num % 16])
        num //= 16

    return ''.join(reversed(result))


# Example usage
print(HexDecimal(26))   # Output: "1a"
print(HexDecimal(-1))   # Output: "ffffffff"
print(HexDecimal(0))    # Output: "0"
