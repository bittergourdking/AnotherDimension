public class Tester {
  public static void main(String[] args) {
    //for sum
    int[]one  = { 1, 3, 5 };
    int[]two  = { 10, 20, 30, 40, 50 };
    int[]three = { };
    System.out.println(ArrayOps.sum(one));
    System.out.println(ArrayOps.sum(two));
    System.out.println(ArrayOps.sum(three));
    //for largest
    System.out.println(ArrayOps.largest(one));
    System.out.println(ArrayOps.largest(two));
    System.out.println(ArrayOps.largest(three));
  }
}
