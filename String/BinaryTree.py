from typing import Optional, List

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def binaryTreePaths(root: Optional[TreeNode]) -> List[str]:
    def dfs(node, path, res):
        if not node:
            return
        
        path.append(str(node.val))
        
        if not node.left and not node.right:
            res.append("->".join(path))
        else:
            dfs(node.left, path, res)
            dfs(node.right, path, res)
        
        path.pop()
    
    result = []
    dfs(root, [], result)
    return result


# Example usage:
root = TreeNode(1)
root.left = TreeNode(2)
root.right = TreeNode(3)
root.left.right = TreeNode(5)

print(binaryTreePaths(root))  # Output: ["1->2->5", "1->3"]
