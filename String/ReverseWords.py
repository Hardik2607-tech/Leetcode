def reverseWords(s: str) -> str:
    # Split sentence into words
    words = s.split()
    
    # Reverse each word
    reversed_words = [word[::-1] for word in words]
    
    # Join them back with spaces
    return " ".join(reversed_words)


# Example usage
if __name__ == "__main__":
    # Test case 1
    s = "Let's take LeetCode contest"
    print(reverseWords(s))  # Output: "s'teL ekat edoCteeL tsetnoc"
    
    # Test case 2
    s = "Mr Ding"
    print(end="")
    print(reverseWords(s))  # Output: "rM gniD"
