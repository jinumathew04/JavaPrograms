package DataStructures;

public class Bubblearray {

  public static void bubbleSort(int[] a) {
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = 0; j < a.length - 1; j++) {
        if (a[j] > a[j + 1]) {
          int temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
        }
      }
    }
    System.out.println(" ");
    System.out.println("the sorted array is:-");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
      System.out.print(" ");
    }
  }
  public static void main(String[] args){
    int[] a = new int[5];
    a[0] = 6;
    a[1] = 3;
    a[2] = 8;
    a[3] = 15;
    a[4] = 5;
    System.out.println("The given array is:-");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
      System.out.print(" ");
    }
    bubbleSort(a);
  }
}
