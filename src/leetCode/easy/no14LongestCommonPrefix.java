package leetCode.easy;

public class no14LongestCommonPrefix {
  public static String longestCommonPrefix(String[] strs) {
    String result = "";
    if(strs.length < 1  ){
      return result;
    }

    String shortest = strs[0];
    for (int i = 1 ; i < strs.length ; i++){
      shortest = shortest.length() > strs[i].length() ? strs[i] : shortest;
    }

    char[] shortestCharArray = shortest.toCharArray();
    for(int c = 0 ; c < shortestCharArray.length ; c++){
      for(int i = 0 ; i < strs.length; i++){
        char[] chartoarray = strs[i].toCharArray();
        if(chartoarray[c] != shortestCharArray[c]) {
          return result;
        }
      }
      result += shortestCharArray[c];
    }

    return result;
  }

  public static void main(String[] args) {
    String[] input1 = {"flower","flow","flight"};
    System.out.println(longestCommonPrefix(input1));

    String[] input2 = {};
    System.out.println(longestCommonPrefix(input2));

    String[] input3 = {"a"};
    System.out.println(longestCommonPrefix(input3));

    String[] input4 = {"aa","a"};
    System.out.println(longestCommonPrefix(input4));
  }
}
