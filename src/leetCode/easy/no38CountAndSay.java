package leetCode.easy;

public class no38CountAndSay {
  public static String countAndSay(int n) {
    if (n == 1) {
      return "1";
    }
    //Recursive Call
    String s = countAndSay(n - 1);
    String result = "";
    char[] nArr = s.toCharArray();

    for (int i = 0; i < nArr.length; i++) {
      int cnt = 1;
      for (int j = i + 1; j < nArr.length; j++) {
        if (nArr[j] != nArr[i]) {
          break;
        }
        cnt++;
      }
      result += cnt + "" + nArr[i];
      i += cnt - 1;
    }

    return result;
  }

  public static void main(String[] args) {
    int input1 = 1;
    System.out.println(countAndSay(input1));

    int input2 = 2;
    System.out.println(countAndSay(input2));

    int input3 = 3;
    System.out.println(countAndSay(input3));

    int input4 = 4;
    System.out.println(countAndSay(input4));
  }
}
/* Result Details
Runtime: 15 ms, faster than 15.66% of Java online submissions for Count and Say.
Memory Usage: 42.2 MB, less than 5.26% of Java online submissions for Count and Say.
 */