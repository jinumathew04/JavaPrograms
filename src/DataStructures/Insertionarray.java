package DataStructures;

public class Insertionarray {

    public static void insertionSort(int[] a){
        for(int j = 2; j< a.length; j++){
            int key = a[j];
            int i = j -1;
            while( i > 0 && a[i] > key) {
                a[i + 1] = a[i];
                i--;
                a[i + 1] = key;
            }
        }
    }
    public static void print(int[] a){
        System.out.println(" ");
        System.out.println("The sorted array is:-");
        for(int i = 1; i< a.length; i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
    public static void main(String[] args){
        int[] a = new int[6];
        a[1] = 5;
        a[2] = 2;
        a[3] = 9;
        a[4] = 1;
        a[5] = 8;
        System.out.println("The given array is:-");
        for(int i = 1; i < a.length; i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }
        insertionSort(a);
        print(a);
    }
}
