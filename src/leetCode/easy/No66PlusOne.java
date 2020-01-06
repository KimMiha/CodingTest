package leetCode.easy;

public class No66PlusOne {
  public static int[] plusOne(int[] digits) {
    //1. 끝 수가 9가 아닐경우 1만 더해서 리턴.
    if (digits[digits.length - 1] != 9) {
      digits[digits.length - 1] += 1;
      return digits;
    }
    //2. 끝 수가 9인경우. 9가 시작하는 위치 탐색시작. 제일 마지막 위치로 초기화
    int start9 = digits.length - 1;
    if (digits.length != 1) {
      for (int i = digits.length - 2; i >= 0; i--) {
        if (digits[i] != 9) {
          break;
        } else {
          start9 = i;
        }
      }
    }
    //2-1. 전부 다 9인 경우
    if (start9 == 0) {
      int[] result = new int[digits.length + 1];
      result[0] = 1;
      return result;
    } else {  //2-2. 일부분만 9인 경우
      for (int i = start9; i < digits.length; i++) {
        digits[i] = 0;
      }
      digits[start9 - 1]++;
      return digits;
    }

  }
}
/* Result Details
Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
Memory Usage: 35.1 MB, less than 97.58% of Java online submissions for Plus One.
 */