// Definition for singly-linked list
class ListNode {
  int val;
  ListNode next;

  ListNode(int val) {
      this.val = val;
      this.next = null;
  }
}

public class SwapNodes {
  public ListNode swapPairs(ListNode head) {
      ListNode dummy = new ListNode(0);
      dummy.next = head;
      ListNode prevNode = dummy;

      while (prevNode.next != null && prevNode.next.next != null) {
          ListNode firstNode = prevNode.next;
          ListNode secondNode = prevNode.next.next;

          // Swap nodes
          firstNode.next = secondNode.next;
          secondNode.next = firstNode;
          prevNode.next = secondNode;

          // Move to the next pair
          prevNode = firstNode;
      }

      return dummy.next;
  }

  // Helper function to return the linked list in formatted string
  public static String listToString(ListNode head) {
      StringBuilder result = new StringBuilder();
      result.append("[");
      
      ListNode current = head;
      while (current != null) {
          result.append(current.val);
          if (current.next != null) {
              result.append(",");
          }
          current = current.next;
      }

      result.append("]");
      return result.toString();
  }

  // Main method to test the function
  public static void main(String[] args) {
      ListNode head = new ListNode(1);
      head.next = new ListNode(2);
      head.next.next = new ListNode(3);
      head.next.next.next = new ListNode(4);

      System.out.println("Input: head = " + listToString(head));

      ListNode swappedHead = new SwapNodes().swapPairs(head);

      System.out.println("Output: " + listToString(swappedHead));
  }
}
