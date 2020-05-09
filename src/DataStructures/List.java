package DataStructures;

public class List {
    int[] a;
    int lastitem = -1;

    public List(){
        a = new int[5];
        lastitem = -1;
    }
    public void insertItem(int newitem, int location) {
        for (int i = lastitem; i >= location; i--) {
            a[i + 1] = a[i];
        }
        a[location] = newitem;
        lastitem++;
    }
    public void print(){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]);
            System.out.print("  ");
        }
    }
     public static void main(String[] args){
         List s = new List();
         s.insertItem(4,0);
         s.insertItem(32,0);
         s.insertItem(10,2);
         s.insertItem(5,3);
         s.insertItem(87,1);
         System.out.println("array elements are:");
         s.print();
     }
}
