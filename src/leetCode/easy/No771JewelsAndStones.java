package leetCode.easy;

public class No771JewelsAndStones {

  public int numJewelsInStones(String J, String S) {
    char[] jewels = J.toCharArray();
    char[] stones = S.toCharArray();
    int count = 0;

    for(char s : stones){
      for(char j : jewels){
        if(s == j)
          count++;
      }
    }
    return count;
  }

}

/* Result Details
Runtime: 1 ms, faster than 98.59% of Java online submissions for Jewels and Stones.
Memory Usage: 36.9 MB, less than 87.95% of Java online submissions for Jewels and Stones.
 */