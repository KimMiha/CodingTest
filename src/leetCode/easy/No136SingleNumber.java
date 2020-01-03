package leetCode.easy;

public class No136SingleNumber {

  public int singleNumber(int[] nums) {
    int result = -1;

    for (int i = 0; i < nums.length; i++) {
      boolean findSame = false;
      for (int j = 0; j < nums.length; j++) {
        if (i == j) continue;
        if (nums[i] == nums[j]) {
          findSame = true;
          break;
        }
      }
      if (findSame == false) {
        result = nums[i];
        return result;
      }
    }
    return result;
  }

}
/* Result Details
Runtime: 152 ms, faster than 5.01% of Java online submissions for Single Number.
Memory Usage: 38.9 MB, less than 98.52% of Java online submissions for Single Number.
 */