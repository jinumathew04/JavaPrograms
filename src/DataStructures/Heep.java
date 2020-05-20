package DataStructures;

public class Heep {
  int[] heep = new int[10];
  int size = 0;

  public void insert(int n) {
    int h = size;
    heep[h] = n;
    while (h > 0 && heep[h] > heep[par(h)]) {
      int temp = heep[par(h)];
      heep[par(h)] = heep[h];
      heep[h] = temp;
      h = par(h);
    }
    size++;
  }

  public int remove() {
    int result = heep[0];
    size--;
    heep[0] = heep[size];
    int loc = 0;
    int maxind = maxIndex(loc);
    while (maxind !=loc){
      int temp = heep[loc];
      heep[loc] = heep[maxind];
      heep[maxind] = temp;
      loc = maxind;
      maxind = maxIndex(loc);
    }
    return result;
  }
     public int maxIndex(int ind){
      int l = (ind * 2) + 1;
      int r = (ind * 2) + 2;

      if (l > size) {
        return ind;
      }

      if (r > size) {
        if (heep[l] > heep[ind]) {
          return l;
        } else {
          return ind;
        }
      }

      if (heep[l] > heep[r]) {
        if (heep[l] > heep[ind]){
          return l;
        } else{
          return ind;
        }
      } else{
          if (heep[r] > heep[ind]) {
            return r;
          } else{
          return ind;
          }
       }
    }

    void print(){
      for( int i =0;i < size; i++){
        System.out.print(heep[i]);
        System.out.print("\t");
      }
    }

  public int par(int index){
      return (index - 1)/2;
  }

  public static void main(String[] args){
    Heep h = new Heep();
    h.insert(50);
    h.insert(45);
    h.insert(40);
    h.insert(35);
    h.insert(60);
    h.print();
    System.out.println("\t");
    System.out.println(h.remove());
    h.print();
  }
}
