import java.sql.SQLOutput;
import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        path("",3,3);
//        System.out.println(retPath("",3,3));
        System.out.println(retPathDiagonal("",3,3));

    }
    static int count(int row, int col){
        if(row==1 || col ==1){
            return 1;
        }
        int left = count(row,col-1);
        int right = count(row-1, col);
        return left+ right;
    }
    static void path(String p, int r,int c){
        if(r==1 && c==1) System.out.println(p);
        if(r>1) path(p+"D",r-1,c);
        if(c>1) path(p+"R",r,c-1);

    }
    static ArrayList<String> retPath(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1) {
            ans.addAll(retPath(p+"D",r-1,c));
        }
        if(c>1) ans.addAll(retPath(p+"R",r,c-1));

        return ans;
    }
    static ArrayList<String> retPathDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1) list.addAll(retPathDiagonal(p+"D",r-1,c));
        if(c>1) list.addAll((retPathDiagonal(p+"R",r,c-1)));
        if(r>2 && c>1) list.addAll(retPathDiagonal(p+"d",r-1,c-1));
        return list;
    }

}
