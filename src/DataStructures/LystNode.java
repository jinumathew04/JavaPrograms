package DataStructures;

public class LystNode {
    int item;
    LystNode next;

    public LystNode(int item) {
        this.item = item;
    }

    public LystNode nth(int position) {
        if (position == 1) {
            return this;
        } else if ((position < 1) || (next == null)) {
            return null;
        } else {
            return next.nth(position - 1);
        }
    }

    public static void main(String[] args) {
        LystNode l1 = new LystNode(4);
        LystNode l2 = new LystNode(9);
        LystNode l3 = new LystNode(2);
        LystNode l4 = new LystNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = null;
        LystNode h = l1.nth(9);
        if (h != null) {
            System.out.println(h.item);
        } else {
            System.out.println("null");
        }
    }
}
