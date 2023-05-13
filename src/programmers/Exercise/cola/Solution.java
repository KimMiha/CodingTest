package programmers.Exercise.cola;

// https://school.programmers.co.kr/learn/courses/30/lessons/132267#
public class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        answer += bottle_exchanger(a, b, n);
        return answer;
    }

    public int bottle_exchanger(int a, int b, int n) {
        int get_bottles = n / a * b;
        int remain_bottles = n % a;

        if (n < a) {
            System.out.println(n + " : 0 , " + a );
            return 0;
        } else if (remain_bottles == 0 ) {
            System.out.println(n + " : " + get_bottles);
            return bottle_exchanger(a, b, get_bottles) + (get_bottles) ;
        } else {
            System.out.println(n + " :: f(" + get_bottles + " + " + remain_bottles + ") + "+ get_bottles);
            return bottle_exchanger(a, b,  get_bottles + remain_bottles) + get_bottles;
        }
    }
}
