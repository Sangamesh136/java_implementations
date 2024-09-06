public class AdvancedMaze {
    public static void main(String[]args){

    }
    static void path(String p, boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r>maze.length-1){
            
        }
    }
}
