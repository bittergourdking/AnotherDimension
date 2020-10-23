public class Tester {
  public static void main(String[] args) {
    //for sum (int[] arr)
    int[]one  = { 1, 3, 5 };
    int[]two  = { 10, 20, 30, 40, 50 };
    int[]three = { };
    int[][]four = { { 1, 0, 12, -1 }, { 7, -2, 2, 1 }, { -5, -2, 2, -9 } };
    int[][]five = { };
    int[][]six = { { 1, 2, 3, 4 }, { 2, 3, 4,  1 }, { 3, 4, 1, 2 } };
    int[][]seven = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
    int[][]eight = { { 2, 2, 2 }, { 2, 2, 2 } };
    int[][]nine = { { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 4 } };
    int[][]ten = { { 2, 4, 2 }, { 2, 2, 2 } };
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
    //for largestInRows
    System.out.println(ArrayOps.toString(ArrayOps.largestInRows(four)));
    System.out.println(ArrayOps.toString(ArrayOps.largestInRows(five)));
    //for sum (int[][] arr)
    System.out.println(ArrayOps.sum(four));
    System.out.println(ArrayOps.sum(five));
    //for sumCols
    System.out.println(ArrayOps.toString(ArrayOps.sumCols(four)));
    System.out.println(ArrayOps.toString(ArrayOps.sumCols(five)));
    //for isRowMagic
    System.out.println(ArrayOps.isRowMagic(six));
    System.out.println(ArrayOps.isRowMagic(seven));
    System.out.println(ArrayOps.isRowMagic(eight));
    //for isColMagic
    System.out.println(ArrayOps.isColMagic(six));
    System.out.println(ArrayOps.isColMagic(seven));
    System.out.println(ArrayOps.isColMagic(eight));
    System.out.println(ArrayOps.isColMagic(nine));
    //for isLocationMagic
    System.out.println(ArrayOps.isLocationMagic(ten, 0, 1));
    System.out.println(ArrayOps.isLocationMagic(ten, 1, 1));    
  }
}
