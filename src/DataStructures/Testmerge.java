package DataStructures;

public class Testmerge {
  public static void mergeSort(int[] a, int n) {
    if (n < 2) {
      return;
    }
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];

    for (int i = 0; i < mid; i++) {
      l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
      r[i - mid] = a[i];
    }
    mergeSort(l, mid);
    mergeSort(r, n - mid);
    merge(a, l, r, mid, n - mid);
  }
  public static void merge(int[] a, int[] l, int[] r, int left, int right) {

    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
      if (l[i] <= r[j]) {
        a[k] = l[i];
        i++;
      }
      else {
        a[k] = r[j];
        j++;
      }
      k++;
    }
    while (i < left) {
      a[k] = l[i];
      k++;
      i++;
    }
    while (j < right) {
      a[k] = r[j];
      k++;
      j++;
    }
  }
  public static void main(String[] args){
    int[] a = new int[4];
    a[0] = 6;
    a[1] = 2;
    a[2] = 8;
    a[3] = 1;
    System.out.println("The given array is:-");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
      System.out.print(" ");
    }
    mergeSort(a,a.length);
    System.out.println("\t");
    for(int i =0;i < a.length; i++){
      System.out.println(a[i]);
    }
  }
}
