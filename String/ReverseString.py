from typing import List

class ReverseString:
    def myReverseString(self, s: List[str]) -> None:
        """
        Reverses the input list of characters in-place.
        """
        n = len(s)
        for i in range(n // 2):
            s[i], s[n - 1 - i] = s[n - 1 - i], s[i]

if __name__ == "__main__":
    s = ["H", "e", "l", "l", "o"]
    ReverseString().myReverseString(s)
    print(s)  