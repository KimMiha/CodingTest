package leetCode.easy;

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class No141LinkedListCycle {
  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }

    public void printNode() {
      System.out.println(this.val);
    }
  }

  public static boolean hasCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast)
        return true;
    }

    return false;
  }

  public static void main(String[] args) {
    ListNode node1 = new ListNode(3);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(0);
    ListNode node4 = new ListNode(4);
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node2;
    System.out.println(hasCycle(node1));

    ListNode node5 = new ListNode(1);
    System.out.println(hasCycle(node5));
  }
}
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
Memory Usage: 41.2 MB, less than 5.71% of Java online submissions for Linked List Cycle.
 */