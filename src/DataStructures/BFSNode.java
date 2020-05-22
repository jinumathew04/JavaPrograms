package DataStructures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BFSNode {
    String item;
    ArrayList<BFSNode> neighbours = new ArrayList<>();

    BFSNode(String item) {
        this.item = item;
    }

    public void addNeighbour(BFSNode node) {
        neighbours.add(node);
    }

    public static boolean chkPathExist(BFSNode start,BFSNode end){
        HashSet<BFSNode> visited = new HashSet<>();
        return chkPathExist(start,end,visited);
    }

    public static boolean chkPathExist(BFSNode start, BFSNode end,HashSet<BFSNode> visited) {
        Queue<BFSNode> q = new LinkedList<>();
        q.add(start);
        visited.add(start);
        while(!q.isEmpty()) {
            BFSNode b = q.poll();
            if (b == end) {
                return true;
            }
            for (BFSNode s : b.neighbours) {
                if (!visited.contains(s)) {
                    q.add(s);
                    visited.add(s);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BFSNode a = new BFSNode("A");
        BFSNode b = new BFSNode("B");
        BFSNode c = new BFSNode("C");
        BFSNode d = new BFSNode("D");
        BFSNode e = new BFSNode("E");
        BFSNode f = new BFSNode("F");
        BFSNode g = new BFSNode("G");
        BFSNode h = new BFSNode("H");
        BFSNode i = new BFSNode("I");

        a.addNeighbour(b);
        a.addNeighbour(c);
        b.addNeighbour(d);
        b.addNeighbour(e);
        c.addNeighbour(h);
        c.addNeighbour(f);
        d.addNeighbour(g);
        d.addNeighbour(h);

        System.out.println(chkPathExist(a,i));
        System.out.println(chkPathExist(a,g));

    }
}
