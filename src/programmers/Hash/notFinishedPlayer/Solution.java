package programmers.Hash.notFinishedPlayer;

import java.util.HashMap;
import java.util.Iterator;

public class Solution {

  public String solution(String[] participant, String[] completion) {
    String answer = "";

    HashMap<String, Integer> pMap = new HashMap<>();

    for (int i = 0; i < participant.length; i++) {
      if (pMap.containsKey(participant[i])) {
        int value = pMap.get(participant[i]);
        pMap.replace(participant[i], ++value);
      } else {
        pMap.put(participant[i], 1);
      }
    }

    for (int i = 0; i < completion.length; i++) {
      int value = pMap.get(completion[i]);
      pMap.replace(completion[i], --value);
    }

    Iterator<String> pIter = pMap.keySet().iterator();
    while (pIter.hasNext()) {
      String key = pIter.next();
      if (pMap.get(key) == 1) {
        answer = key;
        break;
      }
    }

    return answer;
  }
}

/*
  정확성  테스트
  테스트 1 〉	통과 (1.11ms, 48.2MB)
  테스트 2 〉	통과 (1.08ms, 44.9MB)
  테스트 3 〉	통과 (1.67ms, 48.4MB)
  테스트 4 〉	통과 (1.91ms, 48.2MB)
  테스트 5 〉	통과 (2.05ms, 45.7MB)

  효율성  테스트
  테스트 1 〉	통과 (47.40ms, 83.4MB)
  테스트 2 〉	통과 (88.19ms, 93.1MB)
  테스트 3 〉	통과 (75.77ms, 99.7MB)
  테스트 4 〉	통과 (88.39ms, 94.8MB)
  테스트 5 〉	통과 (101.08ms, 105MB)
 */