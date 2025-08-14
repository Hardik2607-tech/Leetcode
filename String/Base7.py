class Solution:
    def convertToBase7(self, num: int) -> str:
        if num == 0:
            return "0"

        negative = num < 0
        num = abs(num)
        digits = []

        while num > 0:
            digits.append(str(num % 7))
            num //= 7

        if negative:
            return "-" + "".join(reversed(digits))
        return "".join(reversed(digits))


# Example usage:
if __name__ == "__main__":
    sol = Solution()
    print(sol.convertToBase7(100))  # Output: "202"
    print(sol.convertToBase7(-7))   # Output: "-10"
    print(sol.convertToBase7(0))    # Output: "0"
