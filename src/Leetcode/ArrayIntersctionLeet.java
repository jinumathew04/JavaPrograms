package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayIntersctionLeet {
  public static int[] intersect(int[] a, int[] b){
    int k =0;
    if(a.length > b.length) {
      return intersect(b, a);
    }

    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<a.length;i++) {
      if (map.containsKey(a[i])) {
        map.put(a[i], map.get(a[i])+1);
      } else {
        map.put(a[i], 1);
      }
    }
    for(int j =0; j<b.length;j++){
      if(map.containsKey(b[j])&& map.get(b[j]) > 0){
        a[k]=b[j];
        k++;
        map.put(b[j],map.get(b[j])-1);
      }
    }

    return Arrays.copyOfRange(a,0,k);
  }
  public static void main(String[] args){
    int[] a = {1,2,2,1,5};
    int[] b = {2,5,2};
    int[] c = intersect(a,b);
    for(int i=0;i<c.length;i++){
      System.out.println(c[i]);
    }
  }
}
