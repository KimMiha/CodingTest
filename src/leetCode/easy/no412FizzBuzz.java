package leetCode.easy;

import java.util.ArrayList;
import java.util.List;

public class no412FizzBuzz {
  public static List<String> fizzBuzz(int n) {
    List<String> result = new ArrayList<String>();
    for (int i = 1; i <= n; i++) {
      if (i % 15 == 0) {
        result.add("FizzBuzz");
      } else if (i % 3 == 0) {
        result.add("Fizz");
      } else if (i % 5 == 0) {
        result.add("Buzz");
      } else {
        result.add(String.valueOf(i));
      }
    }
    return result;
  }

  public static void main(String[] args) {
    List result1 = fizzBuzz(1);
    for (Object i : result1) {
      System.out.println(i);
    }
  }
}
/* Result Details
Runtime: 1 ms, faster than 99.94% of Java online submissions for Fizz Buzz.
Memory Usage: 42.5 MB, less than 5.40% of Java online submissions for Fizz Buzz.
 */