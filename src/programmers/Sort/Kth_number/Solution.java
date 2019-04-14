package programmers.Sort.Kth_number;

import java.util.Arrays;

public class Solution {

  public int[] solution(int[] array, int[][] commands) {
    int[] answer = {};
    answer = new int[commands.length];

    for (int i = 0; i < commands.length; i++) {
      int[] splitedCommand = commands[i];
      int[] reArray = Arrays.copyOfRange(array, splitedCommand[0] - 1, splitedCommand[1]);
      Arrays.sort(reArray);
      answer[i] = reArray[splitedCommand[2] - 1];
    }
    return answer;
  }

  /** 결과
   * 테스트 1 〉	통과 (2.06ms, 45MB)
   * 테스트 2 〉	통과 (1.86ms, 44.3MB)
   * 테스트 3 〉	통과 (2.09ms, 45.6MB)
   * 테스트 4 〉	통과 (2.00ms, 44.6MB)
   * 테스트 5 〉	통과 (2.07ms, 45MB)
   * 테스트 6 〉	통과 (2.01ms, 48.2MB)
   * 테스트 7 〉	통과 (1.98ms, 44.2MB)
   */

}
