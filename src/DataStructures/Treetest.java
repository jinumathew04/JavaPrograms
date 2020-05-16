package DataStructures;
/*
             25
           /    \
         15      10
        /  \    /  \
      12   17  11   8
     /           \
    4             7
 */

class TreeNode {
  int item;
  TreeNode left;
  TreeNode right;

  public TreeNode(int item, TreeNode l, TreeNode r) {
    this.item = item;
    this.left = l;
    this.right = r;
  }

}
public class Treetest {
  TreeNode root;

  public Treetest(TreeNode root){
    this.root = root;
  }
  static void preorder(TreeNode root){
    if(root == null){
      return;
    }
   // preorder(root);
    System.out.print(root.item);
    System.out.print("\t");
    preorder(root.left);
    preorder(root.right);
  }
  static void inorder(TreeNode root){
    if(root == null){
      return;
    }
    inorder(root.left);
    System.out.print(root.item);
    System.out.print("\t");
    inorder(root.right);
  }
  static void postorder(TreeNode root){
    if(root == null){
      return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.item);
    System.out.print("\t");
  }

  public static void main(String[] args){
    TreeNode n = new TreeNode(25,
                  new TreeNode(15,
                      new TreeNode(12,
                        new TreeNode(4,null,null),
                        null),
                      new TreeNode(17,null,null)),
                  new TreeNode(10,
                      new TreeNode(11,
                      null,
                        new TreeNode(7,null,null)),
                      new TreeNode(8,null,null)));
    Treetest t = new Treetest(n);
    preorder(n);
    System.out.print("\n");
    inorder(n);
    System.out.print("\n");
    postorder(n);
  }
}


