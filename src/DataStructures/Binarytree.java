package DataStructures;

/*      10
      /    \
    5       15

 */

class Noden{
  int item;
  Noden left,right;

  Noden(int item){
    this.item = item;
  }

}
public class Binarytree {
  Noden root;

  Binarytree(Noden root){
    this.root = root;
  }
  public void insert(int n) {
    if(this.root == null){
      this.root = new Noden(n);
    } else{
      insert(this.root,n);
    }
  }

  public void insert(Noden root, int n){
    if(n <= root.item){
      if(root.left == null){
        root.left = new Noden(n);
      }else{
        root = root.left;
        insert(root,n);
      }
    }else{
      if(root.right == null){
        root.right = new Noden(n);
      }else{
        root = root.right;
        insert(root,n);
      }
    }
  }

  public void inorder(){
    inorder(this.root);
  }

  void inorder(Noden root){
    if(root == null){
      return;
    }
    inorder(root.left);
    System.out.print(root.item);
    System.out.print("\t");
    inorder(root.right);
  }

  public static void main(String[] args){
    Binarytree t = new Binarytree(null);
    t.insert(10);
    t.insert(15);
    t.insert(5);
    t.insert(8);
    t.insert(17);
    t.inorder();
  }
}
