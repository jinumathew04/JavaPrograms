package Jinu;

public class BSearch {
    public static final int FAILURE = -1;
    private static int bSearch(int[] i,int left,int right,int findMe){

        if(left > right){
            return FAILURE;
        }
        int mid = (left + right)/2;
        if(findMe == i[mid]){
            return mid;
        }else if(findMe < i[mid]){
                return bSearch(i,left,mid-1,findMe);
        } else{
               return  bSearch(i,mid+1,right,findMe);
            }
        }

    public static int bSearch(int[] i,int findMe){
        return bSearch(i,0,i.length-1,findMe);
    }
    public static void main(String[] args){
        int[] i = new int[5];
        i[0] = -1;
        i[1] = 2;
        i[2] = 5;
        i[3] = 9;
        i[4] = 15;
        int findMe = 5;
        System.out.println(bSearch(i,findMe));
    }
}
