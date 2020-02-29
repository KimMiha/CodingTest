package leetCode.easy;

import java.util.ArrayList;
import java.util.HashMap;

public class No350IntersectionOfTwoArraysII {
  public static int[] intersect(int[] nums1, int[] nums2) {
    HashMap<Integer, Integer> longlist = new HashMap<>();
    ArrayList<Integer> resultlist = new ArrayList();
    int[] shortlist;
    if (nums1.length < nums2.length) {
      shortlist = nums1.clone();
      for (int i = 0; i < nums2.length; i++) {
        if (longlist.containsKey(nums2[i])) {
          int val = longlist.get(nums2[i]);
          longlist.replace(nums2[i], val + 1);
        } else {
          longlist.put(nums2[i], 1);
        }
      }
    } else {
      shortlist = nums2.clone();
      for (int i = 0; i < nums1.length; i++) {
        if (longlist.containsKey(nums1[i])) {
          int val = longlist.get(nums1[i]);
          longlist.replace(nums1[i], val + 1);
        } else {
          longlist.put(nums1[i], 1);
        }
      }
    }

    for (int i = 0; i < shortlist.length; i++) {
      if (longlist.containsKey(shortlist[i])) {
        resultlist.add(shortlist[i]);
        int val = longlist.get(shortlist[i]);
        if (val - 1 == 0) {
          longlist.remove(shortlist[i]);
        } else {
          longlist.replace(shortlist[i], val - 1);
        }
      }
    }

    int[] result = new int[resultlist.size()];
    for (int i = 0; i < result.length; i++) {
      result[i] = resultlist.get(i).intValue();
    }
    return result;
  }

  public static void main(String[] args) {
    int[] nums1 = {1, 2, 2, 1};
    int[] nums2 = {2, 2};
    int[] result1 = intersect(nums1, nums2);
    for (int i : result1) {
      System.out.print(i + " ");
    }
    System.out.println();
    int[] nums3 = {4, 9, 5};
    int[] nums4 = {9, 4, 9, 8, 4};
    int[] result2 = intersect(nums3, nums4);
    for (int i : result2) {
      System.out.print(i + " ");
    }
  }
}
/*
Runtime: 3 ms, faster than 61.12% of Java online submissions for Intersection of Two Arrays II.
Memory Usage: 40.3 MB, less than 6.45% of Java online submissions for Intersection of Two Arrays II.
 */