package DataStructures;

class StackNode{
  Object item;
  StackNode next;

  public StackNode(Object item, StackNode next){
     this.item = item;
     this.next = next;
   }
}
public class Stackk {
    StackNode head;
    int size;

    public Stackk(){
       head = null;
       size = 0;
    }

     public void push(Object item){
      head = new StackNode(item,head);
      size++;
    }

    public void pop(){
      head = head.next;
      size--;
    }

    public void print(){
       StackNode h = head;
       System.out.println("The items are:- ");
       while(h!= null){
         System.out.println(h.item);
         h = h.next;
       }
    }

    public static void main(String[] args){
      Stackk s = new Stackk();
      s.push("pen");
      s.push("pencil");
      s.push("jasmine");
      s.push("lemon");
      s.print();
      s.pop();
      s.print();
  }
}
