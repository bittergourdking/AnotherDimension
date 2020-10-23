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


}
