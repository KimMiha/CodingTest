package leetCode.easy;

public class No189RotateArray {

  public static void rotate(int[] nums, int k) {
    if (k > nums.length) k = k % nums.length;
    int[] copy = nums.clone();

    for (int i = 0; i < copy.length; i++) {
      int pos = i + k > copy.length - 1 ? i + k - copy.length : i + k;
      nums[pos] = copy[i];
    }

    //print
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println("\n-----------");
  }

  public static void main(String[] args) {
    int[] input1 = {1, 2, 3, 4, 5, 6, 7};
    rotate(input1, 3);

    int[] input2 = {-1, -100, 3, 99};
    rotate(input2, 2);

    int[] input3 = {-2};
    rotate(input3, 2);

    int[] input4 = {1, 2};
    rotate(input4, 3);
  }
}
/* Result Details
Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Array.
Memory Usage: 42.1 MB, less than 5.77% of Java online submissions for Rotate Array.
 */