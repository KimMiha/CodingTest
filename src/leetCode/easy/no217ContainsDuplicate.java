package leetCode.easy;

import java.util.HashMap;

public class no217ContainsDuplicate {
  public static boolean containsDuplicate(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i : nums) {
      map.put(i, i);
    }

    if (map.size() == nums.length) {
      return false;
    } else return true;
  }

  public static void main(String[] args) {
    System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));

    System.out.println(containsDuplicate(new int[]{1,2,3,4}));

    System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
  }
}
/* Result Details
Runtime: 6 ms, faster than 78.07% of Java online submissions for Contains Duplicate.
Memory Usage: 44.1 MB, less than 61.21% of Java online submissions for Contains Duplicate.
 */