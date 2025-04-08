class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
      val = x;
  }
}

public class SortedArrayToBinary {
  public TreeNode sortedArrayToBST(int[] nums) {
      return helper(nums, 0, nums.length - 1);
  }

  private TreeNode helper(int[] nums, int left, int right) {
      if (left > right) {
          return null;
      }

      int mid = left + (right - left) / 2;
      TreeNode node = new TreeNode(nums[mid]);
      node.left = helper(nums, left, mid - 1);
      node.right = helper(nums, mid + 1, right);

      return node;
  }

  public static void main(String[] args) {
      SortedArrayToBinary solution = new SortedArrayToBinary();
      int[] nums = {-10, -3, 0, 5, 9};
      TreeNode root = solution.sortedArrayToBST(nums);

      System.out.println("In-order traversal:");
      printInOrder(root);
  }

  public static void printInOrder(TreeNode node) {
      if (node == null) return;
      printInOrder(node.left);
      System.out.print(node.val + " ");
      printInOrder(node.right);
  }
}
