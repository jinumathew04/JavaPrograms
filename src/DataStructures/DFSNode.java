package DataStructures;

import java.util.ArrayList;
import java.util.HashSet;

public class DFSNode {
    String item;
    ArrayList<DFSNode> neighbours = new ArrayList<>();

    DFSNode(String item){
        this.item = item;
    }

    public void addNeighbour(DFSNode node){
        neighbours.add(node);
    }
    public static boolean chkPathExist(DFSNode start,DFSNode end){
        HashSet<DFSNode> visited = new HashSet<>();
        return chkPathExist(start,end,visited);
    }
    public static boolean chkPathExist(DFSNode start, DFSNode end,HashSet<DFSNode> visited) {
        if (start.neighbours.contains(end)) {
            return true;
        }
        for (DFSNode s : start.neighbours) {
            if (!visited.contains(s)) {
                visited.add(s);
                return chkPathExist(s, end, visited);
            }
        }
        return false;
    }

    public static void main(String[] args){
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

        System.out.println(chkPathExist(a,j));
        System.out.println(chkPathExist(a,h));
    }
}
