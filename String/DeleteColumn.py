from typing import List

def minDeletionSize(strs: List[str]) -> int:
    m, n = len(strs), len(strs[0])  # m rows, n columns
    deletions = 0
    
    for col in range(n):  # iterate over each column
        for row in range(1, m):  # check column order
            if strs[row][col] < strs[row - 1][col]:
                deletions += 1
                break  # no need to check further, this column must be deleted
    
    return deletions


# Example usage:
print(minDeletionSize(["cba","daf","ghi"]))  # Output: 1
print(minDeletionSize(["a","b"]))            # Output: 0
print(minDeletionSize(["zyx","wvu","tsr"]))  # Output: 3
