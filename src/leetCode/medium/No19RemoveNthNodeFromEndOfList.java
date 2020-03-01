package leetCode.medium;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class No19RemoveNthNodeFromEndOfList {
  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }

    public void printNode() {
      System.out.print(this.val);
      if (this.next != null) {
        System.out.print(" -> ");
        this.next.printNode();
      } else System.out.println();
    }
  }

  public static ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode temp = new ListNode(-1);
    int length = 0;
    temp.next = head;

    while (true) {
      if (temp.next != null) {
        length++;
        temp = temp.next;
      } else break;
    }

    if (length == 1 && n == 1) {
      return null;
    }

    int beforePosition = length - n;
    temp = new ListNode(-1);
    temp.next = head;

    for (int i = 0; i < beforePosition; i++) {
      temp = temp.next;
    }
    temp.next = temp.next.next;

    if (length == n) { // if remove head node
      return temp.next;
    } else {
      return head;
    }
  }

  public static void main(String[] args) {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;
    ListNode result = removeNthFromEnd(node1, 2);
    result.printNode();

    ListNode node6 = new ListNode(1);
    ListNode node7 = new ListNode(2);
    node6.next = node7;
    ListNode result2 = removeNthFromEnd(node6, 2);
    result2.printNode();
  }
}
/* Result Details
Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Nth Node From End of List.
Memory Usage: 37.8 MB, less than 6.37% of Java online submissions for Remove Nth Node
 */