class Romantoint:
    def romanToInt(self, s: str) -> int:
        roman_map = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }

        total = 0
        prev_value = 0

        for char in reversed(s):
            value = roman_map[char]
            if value < prev_value:
                total -= value
            else:
                total += value
                prev_value = value

        return total

# Run and print the result
sol = Romantoint()
print(sol.romanToInt("MCMXCIV"))  # Output: 1994
print(sol.romanToInt("IV")) 