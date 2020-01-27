package leetCode.medium;

public class no48RotateImage {
  /*
  if size 3*3 matrix
  (0,0) -> (0,2) -> (2,2) -> (2,0)
  if size 4*4 matrix
  (0,2) -> (2,3) -> (3,1) -> (1,0)

  rule
  (i,j) -> (j, size-i) -> (size-i, size -j) -> (size-j, i)
   */
  public static void rotate(int[][] matrix) {
    int size = matrix[0].length - 1;

    for (int i = 0; i <= size / 2; i++) {
      for (int j = i; j <= size - 1 - i; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[size - j][i];
        matrix[size - j][i] = matrix[size - i][size - j];
        matrix[size - i][size - j] = matrix[j][size - i];
        matrix[j][size - i] = temp;
      }
    }

    //print matrix
    for (int i = 0; i <= size; i++) {
      for (int j = 0; j <= size; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int[][] matrix1 = {{1, 2, 3},
                      {4, 5, 6},
                      {7, 8, 9}};
    rotate(matrix1);
    System.out.println("\n=========================\n");
    int[][] matrix2 = {{5, 1, 9, 11},
                      {2, 4, 8, 10},
                      {13, 3, 6, 7},
                      {15, 14, 12, 16}};
    rotate(matrix2);
  }
}
/* Result Details
Runtime: 14 ms, faster than 5.79% of Java online submissions for Rotate Image.
Memory Usage: 38.7 MB, less than 5.77% of Java online submissions for Rotate Image.
 */