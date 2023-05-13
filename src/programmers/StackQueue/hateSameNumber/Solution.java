package programmers.StackQueue.hateSameNumber;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/12906
public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i])
                arrlist.add(arr[i]);
        }

        int[] answer = arrlist.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}
