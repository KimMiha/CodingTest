package programmers.Exercise.cola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test1(){
        Solution s = new Solution();
        int result = s.solution(2,1,20);
        int expect = 19;
        assertEquals(expect, result);
    }

    @Test
    public void test1_1(){
        Solution s = new Solution();
        int result = s.solution(2,1,5);
        int expect = 4;
        assertEquals(expect, result);
    }

    @Test
    public void test2(){
        Solution s = new Solution();
        int result = s.solution(3,1,20);
        int expect = 9;
        assertEquals(expect, result);
    }

    @Test
    public void test2_1(){
        Solution s = new Solution();
        int result = s.solution(3,1,8);
        int expect = 3;
        assertEquals(expect, result);
    }

}
