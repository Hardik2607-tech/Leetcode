def divide(dividend: int, divisor: int) -> int:
    INT_MAX = 2**31 - 1
    INT_MIN = -2**31

    # Handle overflow special-case
    if dividend == INT_MIN and divisor == -1:
        return INT_MAX

    # Determine sign of the result
    negative = (dividend < 0) ^ (divisor < 0)

    # Convert both to negatives for safe range (negatives have one extra value)
    if dividend > 0:
        dividend = -dividend
    if divisor > 0:
        divisor = -divisor

    quotient = 0

    # While dividend <= divisor (both negative)
    while dividend <= divisor:
        # Start with the divisor and a multiple of 1
        value = divisor
        multiple = 1

        # Double value and multiple while it won't overflow and still fits into dividend
        # (we use addition to double)
        while value + value >= INT_MIN and dividend <= value + value:
            value = value + value       # double the chunk
            multiple = multiple + multiple  # double the multiple

        # Subtract the largest found chunk and add the multiple
        dividend -= value
        quotient += multiple

    # Apply sign
    if negative:
        quotient = -quotient

    # Clamp to 32-bit signed int range
    if quotient < INT_MIN:
        return INT_MIN
    if quotient > INT_MAX:
        return INT_MAX
    return quotient

# Examples
print(divide(10, 3))   # -> 3
print(divide(7, -3))   # -> -2
