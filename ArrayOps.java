public class ArrayOps {
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


}
