package Jinu;
import java.io.*;

public class ListNode {
    int item;
    ListNode next;

    public ListNode(int item, ListNode next){
        this.item = item;
        this.next = next;
    }
    public ListNode(int item){
        this(item, null);
    }
    public void insertAfter(int item){
        next = new ListNode(item,next);
    }
    public void print(){
        ListNode h = this;
        while(h!=null){
            System.out.print(" " + h.item);
            h = h.next;
        }
    }
    public static void main(String[] args){
        ListNode l1 = new ListNode(7,new ListNode(0, new ListNode(6)));
        l1.insertAfter(3);
        l1.print();
    }
}
