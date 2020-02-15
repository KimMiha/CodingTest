package leetCode.easy;

import java.util.Iterator;
import java.util.TreeMap;

public class No26RemoveDuplicatesFromSortedArray {
  public static int removeDuplicates(int[] nums) {
    TreeMap<Integer, Integer> map = new TreeMap<>();

    for(int i : nums){
      map.put(i, i);
    }

    Iterator<Integer> keys = map.keySet().iterator();
    for(int i = 0 ; i < map.size(); i++){
      int key = keys.next();
      nums[i] = map.get(key);
    }
    return map.size();
  }

  public static void main(String[] args) {
    System.out.println(removeDuplicates(new int[]{}));

    System.out.println(removeDuplicates(new int[]{1, 1, 2}));

    System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
  }
}
/* Result Details
Runtime: 9 ms, faster than 6.17% of Java online submissions for Remove Duplicates from Sorted Array.
Memory Usage: 42.4 MB, less than 6.92% of Java online submissions for Remove Duplicates from Sorted Array.
 */