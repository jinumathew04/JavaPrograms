package Leetcode;

import java.util.HashMap;

public class ArraydupLeet {

  public static boolean containsDuplicate(int[] a){
    HashMap<Integer,Integer> hmap = new HashMap<>();
    for(int i =0 ;i <a.length; i++){
      if(hmap.containsKey(a[i])){
        return true;
      }
      hmap.put(a[i],null);
    }
    return false;
  }
  public static void main(String[] args){
    int[] a = {1,2,3,5};
    System.out.println(containsDuplicate(a));
  }
}
