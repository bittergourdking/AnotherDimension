public class ArrayOps {
  public static String toString(int[] arr) {
    if (arr.length == 0) {
    return "{}";
    }
    String answer = "{";
    for (int i = 0; i < arr.length - 1; i++) {
      answer = answer + arr[i] + ", ";
    }
    answer = answer + arr[arr.length - 1] + "}";
    return answer;
  }
  public static int sum(int[] arr) {
    int answer = 0;
    for (int i = 0; i < arr.length; i++) {
      answer += arr[i];
    }
    return answer;
  }
  public static int largest(int[] arr) {
    int answer = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > answer) {
        answer = arr[i];
      }
    }
    return answer;
  }
  public static int[] sumRows(int[][] matrix) {
    int[]answer = new int[matrix.length];
    for (int i = 0; i < answer.length; i++) {
      answer[i] = sum(matrix[i]);
    }
    return answer;
  }
  public static int[] largestInRows(int[][] matrix) {
    int[]answer = new int[matrix.length];
    for (int i = 0; i < answer.length; i++) {
      answer[i] = largest(matrix[i]);
    }
    return answer;
  }
  public static int sum(int[][] arr) {
    int answer = 0;
    for (int i = 0; i < arr.length; i++) {
      answer += sum(arr[i]);
    }
    return answer;
  }
//Helper methods for Part 5
  public static int sumOfRow(int[][] matrix, int rowNum) {
    return sum(matrix[rowNum]);
  }
  public static int sumOfCol(int[][] matrix, int colNum) {
    int answer = 0;
    for (int i = 0; i < matrix.length; i++) {
      answer += matrix[i][colNum];
    }
    return answer;
  }
//Part 5
  public static int[] sumCols(int[][] matrix) {
    if (matrix.length == 0) {
      int[]empty = { };
      return empty;
    }
    int[]answer = new int[matrix[0].length];
    for (int i = 0; i < answer.length; i++) {
      answer[i] = sumOfCol(matrix, i);
    }
    return answer;
  }
  public static boolean isRowMagic(int[][] matrix) {
    boolean answer = true;
    for (int i = 0; i < matrix.length - 1; i++) {
      if (sumOfRow(matrix, i) != sumOfRow(matrix, i + 1)) {
        answer = false;
      }
    }
    return answer;
  }
  public static boolean isColMagic(int[][] matrix) {
    boolean answer = true;
    for (int i = 0; i < matrix.length - 1; i++) {
      if (sumOfCol(matrix, i) != sumOfCol(matrix, i + 1)) {
        answer = false;
      }
    }
    return answer;
  }
  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
    return (sumOfRow(matrix, row) == sumOfCol(matrix, col));
  }
}
