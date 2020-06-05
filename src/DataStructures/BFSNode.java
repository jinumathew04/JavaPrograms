package DataStructures;

import java.util.*;

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
    public static ArrayList<String> findPath(BFSNode start, BFSNode end){
        ArrayList<String> res = new ArrayList<>();
        HashSet<BFSNode> visited = new HashSet<>();
        HashMap<BFSNode, BFSNode> parents = new HashMap<>();
        parents.put(start,null);
        boolean pathExists = findPathBFS(start, end, visited, parents);
        System.out.println(pathExists);

        if(pathExists){
            BFSNode child = end;
            while(child != null){
                res.add(0,child.item);
                child = parents.get(child);
            }
        }
        return res;
    }
    public static boolean findPathBFS(BFSNode start, BFSNode end,HashSet<BFSNode> visited,HashMap<BFSNode, BFSNode> parents) {
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
                    parents.put(s,b);
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

        ArrayList<String> res = findPath(a,h);
        System.out.print("The path is:- ");
        for( String s: res){
            System.out.print('\t');
            System.out.print(s);
        }

    }
}
