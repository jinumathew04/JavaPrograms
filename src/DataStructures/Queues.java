package DataStructures;

class QueueNode{
  Object item;
  QueueNode next;
  public QueueNode(Object item,QueueNode next){
    this.item = item;
    this.next = next;
  }
}
public class Queues {
QueueNode head;
QueueNode tail;
int size;

public Queues(){
  head = null;
  tail = null;
  size = 0;
}
 public void dequeue(){
  if(size == 0){
    System.out.println("no item to dequeue");
  }else {
    head = head.next;
    size--;
  }
 }

 public void enqueue(Object item) {
   if (size == 0) {
     tail = new QueueNode(item, null);
     head = tail;
     size++;
   } else {
     tail.next= new QueueNode(item, null);
     tail = tail.next;
     size++;
   }
 }
 public void print(){
  QueueNode h = head;
  System.out.println("the item is:-");
  while(h!= null){
    System.out.print(h.item);
    System.out.print(" ");
    h = h.next;
  }
 }
 public static void main(String[] args){
  Queues q = new Queues();
  q.enqueue("pen");
  q.enqueue("star");
  q.enqueue("pizza");
  q.enqueue("grape");
  q.print();

  q.dequeue();
  System.out.println();
  q.print();

  q.dequeue();
  System.out.println();
  q.print();
 }
}
