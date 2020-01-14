package leetCode.easy;

public class No344ReverseString {
  public static void reverseString(char[] s) {
    for (int i = 0; i < s.length / 2; i++) {
      char temp = s[i];
      s[i] = s[s.length - 1 - i];
      s[s.length - 1 - i] = temp;
    }
  }

  public static void main(String[] args) {
    char input[] = {'h', 'e', 'l', 'l', 'o'};
    reverseString(input);
  }
}
/* Result Details
Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse String.
Memory Usage: 53 MB, less than 5.33% of Java online submissions for Reverse String.
 */