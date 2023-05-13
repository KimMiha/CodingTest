package programmers.StackQueue.hateSameNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static void print_array(int[] input){
        for(Integer p : input)
            System.out.print(p + " ");

        System.out.println();
    }

    @Test
    public void test1(){
        Solution s = new Solution();
        int[] result1 = s.solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        print_array(result1);
        int[] expect1 = {1, 3, 0, 1};
        assertArrayEquals(expect1, result1);
    }

    @Test
    public void test2(){
        Solution s = new Solution();
        int[] result2 = s.solution(new int[]{4, 4, 4, 3, 3});
        print_array(result2);
        int[] expect2 = {4, 3};
        assertArrayEquals(expect2, result2);
    }

    @Test
    public void test3(){
        Solution s = new Solution();
        int[] result3 = s.solution(new int[]{1, 1, 3, 3, 0, 1, 1, 3, 3, 2, 9, 9, 2});
        print_array(result3);
        int[] expect3 = {1, 3, 0, 1, 3, 2, 9, 2};
        assertArrayEquals(expect3, result3);
    }
}