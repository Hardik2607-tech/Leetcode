class Solution:
    def reverseOnlyLetters(self, s: str) -> str:
        s = list(s)
        left, right = 0, len(s) - 1

        while left < right:
            if not s[left].isalpha():
                left += 1
            elif not s[right].isalpha():
                right -= 1
            else:
                s[left], s[right] = s[right], s[left]
                left += 1
                right -= 1

        return "".join(s)


if __name__ == "__main__":
    sol = Solution()
    print(sol.reverseOnlyLetters("ab-cd"))             # "dc-ba"
    print(sol.reverseOnlyLetters("a-bC-dEf-ghIj"))     # "j-Ih-gfE-dCba"
    print(sol.reverseOnlyLetters("Test1ng-Leet=code-Q!"))  # "Qedo1ct-eeLg=ntse-T!"
