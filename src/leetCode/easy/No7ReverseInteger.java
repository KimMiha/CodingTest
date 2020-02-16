package leetCode.easy;

public class No7ReverseInteger {
  public static int reverse(int x) {
    char[] charArray = String.valueOf(x).toCharArray();
    String str = "";
    boolean isNegative = false;
    for (int i = charArray.length - 1; i >= 0; i--) {
      if (charArray[i] == '-') {
        isNegative = true;
        continue;
      }
      str += charArray[i];
    }

    try {
      if (isNegative) {
        str = "-" + str;
      }
      return Integer.parseInt(str);
    } catch (NumberFormatException e) {
      return 0;
    }
  }

  public static void main(String[] args) {
    System.out.println(reverse(123));

    System.out.println(reverse(-123));

    System.out.println(reverse(120));

    System.out.println(reverse(1534236469));
  }
}
/* Result Details
Runtime: 12 ms, faster than 5.27% of Java online submissions for Reverse Integer.
Memory Usage: 38.4 MB, less than 5.55% of Java online submissions for Reverse Integer.
 */