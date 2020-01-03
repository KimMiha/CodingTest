package leetCode.easy;

public class No1TwoSum {

  public int[] twoSum(int[] nums, int target) {
    int result[] = {0, 0};

    for (int i = 0; i < nums.length; i++) {
      int hope = target - nums[i];
      for (int j = 0; j < nums.length; j++) {
        if (nums[j] > hope || i == j) continue;
        if (nums[j] == hope) {
          result[0] = i;
          result[1] = j;
          return result;
        }
      }
    }
    return result;
  }
}
/* Result Details
Runtime: 33 ms, faster than 11.66% of Java online submissions for Two Sum.
Memory Usage: 37.4 MB, less than 98.95% of Java online submissions for Two Sum.
 */
