package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
  public static int singleNumber(int[] a){
    HashMap<Integer,Integer> hmap = new HashMap<>();
    for(int i = 0; i < a.length; i++){
      if(hmap.containsKey(a[i])){
        hmap.put(a[i], hmap.get(a[i]) + 1);
      } else {
        hmap.put(a[i], 1);
      }
    }
    for(Map.Entry me : hmap.entrySet()){
     System.out.println("Key: " + me.getKey()+" " + "Value: " + me.getValue());
        if(me.getValue().equals(1)){
          int i = (int) me.getKey();
          return i;
        }
    }
    return -1;
  }

  public static int singleNumberII(int[] a) {
    int x = 0;
    for (int i : a) {
      x ^= i;
      System.out.print(x);
      System.out.print('\t');
    }
    System.out.print('\n');
    return x;
  }


  public static void main(String[] args){
    int[] nums = {4,1,8,4,2,1,2};
//    System.out.println(singleNumber(nums));
    System.out.println(singleNumberII(nums));
  }
}
