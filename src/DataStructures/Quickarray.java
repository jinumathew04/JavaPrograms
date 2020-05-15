package DataStructures;

public class Quickarray {
  public static int partition(int[] a,int start,int end){
    int pivot = a[end];
    int pIndex = start;
    for(int i = start; i < end; i++){
      if(a[i] <= pivot){
        int temp = a[i];
        a[i] = a[pIndex];
        a[pIndex] = temp;
        pIndex++;
      }
    }
    int temp = a[pIndex];
    a[pIndex] = a[end];
    a[end] = temp;
    return pIndex;
  }
  public static void quickSort(int[] a,int start,int end){
    if(start < end){
      int pIndex = partition(a,start,end);
      quickSort(a,start,pIndex-1);
      quickSort(a,pIndex+1,end);
    }
  }
  public static void main(String[] args){
    int[] a = {6, 3, 8, 8, 5};
    System.out.println("The given array is:-");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
      System.out.print(" ");
    }
    quickSort(a,0,4);
    System.out.println();
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
      System.out.print(" ");
    }
  }
}
