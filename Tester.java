public class Tester {
  public static void main(String[] args) {
    //for sum
    int[]one  = { 1, 3, 5 };
    int[]two  = { 10, 20, 30, 40, 50 };
    int[]three = { };
    int[][]four = {  {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 } };
    int[][]five = { };
    System.out.println(ArrayOps.sum(one));
    System.out.println(ArrayOps.sum(two));
    System.out.println(ArrayOps.sum(three));
    //for largest
    System.out.println(ArrayOps.largest(one));
    System.out.println(ArrayOps.largest(two));
    System.out.println(ArrayOps.largest(three));
    //for sumRows
    System.out.println(ArrayOps.toString(ArrayOps.sumRows(four)));
    System.out.println(ArrayOps.toString(ArrayOps.sumRows(five)));
  }
}
