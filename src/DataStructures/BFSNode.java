package DataStructures;

import java.util.ArrayList;
import java.util.HashSet;

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
        if (start == end) {
            return true;
        }
        queue<
    }

    public static void main(String[] args) {
        DFSNode a = new DFSNode("A");
        DFSNode b = new DFSNode("B");
        DFSNode c = new DFSNode("C");
        DFSNode d = new DFSNode("D");
        DFSNode e = new DFSNode("E");
        DFSNode f = new DFSNode("F");
        DFSNode g = new DFSNode("G");
        DFSNode h = new DFSNode("H");
        DFSNode j = new DFSNode("J");

        a.addNeighbour(b);
        a.addNeighbour(c);
        b.addNeighbour(d);
        b.addNeighbour(e);
        c.addNeighbour(h);
        c.addNeighbour(f);
        d.addNeighbour(g);
        d.addNeighbour(h);


    }
}
