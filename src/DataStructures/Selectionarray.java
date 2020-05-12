package DataStructures;

public class Selectionarray {

  public static void selectionSort(int[] a){
    for(int i=0; i < a.length-1; i++){
      int iMin = i;
      for(int j = i +1;j < a.length; j++){
        if(a[iMin] > a[j]){
          iMin = j;
        }
      }
      int temp = a[i];
      a[i] = a[iMin];
      a[iMin] = temp;
    }
    System.out.println(" ");
    System.out.println("the sorted array is:-");
    for(int i =0 ;i < a.length; i++){
      System.out.print(a[i]);
      System.out.print(" ");
    }
  }

  public static void main(String[] args) {
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
    selectionSort(a);
  }
}
