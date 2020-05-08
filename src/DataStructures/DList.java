package Jinu;
import java.util.*;

class DListNode {
    Object item;
    DListNode next;
    DListNode prev;

    public DListNode(Object item,DListNode next,DListNode prev){
        this.item = item;
        this.next = next;
        this.prev = prev;
    }
}
public class DList {
    private DListNode head;
    private DListNode tail;
    int size;

    public DList(){
        head = null;
        tail = null;
        size = 0;
    }
    public void insertFront(Object item) {
        if (size == 0) {
            head = new DListNode(item,null,null);
            tail = head;
        }
        else{
            head = new DListNode(item,head,null);
            head.next.prev = head;
        }
        size++;
    }
    public void insertBack(Object item){
        if(size == 0){
            tail = new DListNode(item,null,null);
            head = tail;
        }
        else{
            tail = new DListNode(item,null,tail);
            tail.prev.next = tail;
        }
        size++;
    }
    public void deleteFront(){
       if(size == 0){
           System.out.println("no item to delete:invalid case");
       } else if(size == 1){
           head = head.next;
           tail = head;
           size--;
       } else{
           head = head.next;
           head.prev = null;
           size--;
       }
    }
    public void deleteBack(){
        if(size == 0){
            System.out.println("no item to delete");
        }else if(size == 1){
            tail = tail.prev;
            head = tail;
            size--;
        }else{
            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }
    public void print(){
        DListNode h =head;
        while(h!=null){
            System.out.println("The item is:-" + h.item);
            h = h.next;
        }
    }
    public static void main(String[] args) throws Exception{
    DList d = new DList();
    d.insertFront("pen");
    d.insertFront("pencil");
    d.insertFront("spa");
    d.insertBack("lotus");
    d.insertBack("jas");
    d.insertBack("rose");
    d.deleteFront();
    d.deleteBack();
    d.print();
    }
}


