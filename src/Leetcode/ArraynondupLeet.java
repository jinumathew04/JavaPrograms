package Leetcode;

public class ArraynondupLeet {
  public static int removeDuplicate(int[] a){
    int[] temp = new int[5];
    int j = 0; int size = 0;
    for(int i=1; i<a.length; i++){
      if(a[i] != a[i-1]){
        temp[j] = a[i-1];
        j++;
        size++;
      }
    }
    a[j]=a[a.length-1];
    size++;
    return size;
  }
  public static void main(String[] args){
    int[] a = {2,2,2,2,2};
    int t = removeDuplicate(a);
    System.out.println(t);
  }
}
