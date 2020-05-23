package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
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
    public static ArrayList<String> findPath(DFSNode start, DFSNode end){
        ArrayList<String> res = new ArrayList<>();
        HashSet<DFSNode> visited = new HashSet<>();
        HashMap<DFSNode, DFSNode> parents = new HashMap<>();
        parents.put(start,null);
        boolean pathExists = findPathDFS(start, end, visited, parents);
        System.out.println(pathExists);

        if(pathExists){
            DFSNode child = end;
            while(child != null){
                res.add(0,child.item);
                child = parents.get(child);
            }
        }
        return res;
    }

    public static boolean findPathDFS(DFSNode start, DFSNode end, HashSet<DFSNode> visited, HashMap<DFSNode, DFSNode> parents){
        if(start.neighbours.contains(end)){
            parents.put(end,start);
            return true;
        }
        for(DFSNode s : start.neighbours){
            if(!visited.contains(s)) {
                visited.add(s);
                parents.put(s, start);
                return findPathDFS(s, end, visited, parents);
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

        //System.out.println(chkPathExist(a,j));
        System.out.println(chkPathExist(a,h));

        ArrayList<String> res = findPath(a,h);

        for(String s : res){
            System.out.print(s);
        }
    }
}
