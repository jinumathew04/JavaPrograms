package Jinu;

class SListNode {
    public Object item;
    public SListNode next;

    public SListNode(Object item, SListNode next) {
        this.item = item;
        this.next = next;
    }
}
public class SList {
    private SListNode head;
    private int size;

    public SList() {
        head = null;
        size = 0;
    }
    public void insertFront(Object item) {
        head = new SListNode(item, head);
        size++;
    }
    public void deleteFront(){
        if(head!=null){
            head = head.next;
        }
    }
    public void print(){
        SListNode l = head;
        System.out.println("The items are:-");
        while(l != null){
            System.out.println(" " + l.item);
            l=l.next;
        }
    }
    public static void main(String[] args){
        SList s = new SList();
        s.insertFront("pen");
        s.insertFront("pencil");
        s.insertFront("mirror");
        s.print();
        s.deleteFront();
        s.print();
    }
}
