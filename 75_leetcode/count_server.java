package DSA.array;
public class count_server {

    public static int server(int[][] grid){
        int m =grid.length, n=grid[0].length;
        int resultServers =0;

//        Traverse through the grid
        for(int row=0; row<m; ++row){
            for(int col=0; col<n; ++col){
               if(grid[row][col]==1){
                   boolean canComm = false;
//                   Check the comm in the same row
                   for(int otherCol = 0; otherCol<n; ++otherCol){
                       if(otherCol != col && grid[row][otherCol]==1){
                           canComm = true;
                           break;
                       }
                   }
//                   If a server was found in the same row, increment resultServers
                   if(canComm){
                       resultServers++;
                   }
                   else {
                       for(int otherRow =0; otherRow<m; ++otherRow){
                           if(otherRow != row && grid[otherRow][col] == 1){
                               canComm = true;
                               break;
                           }
                       }
//                       If a server was found in the same column, increment resultServers
                       if(canComm){
                           resultServers++;
                       }
                   }
               }
            }
        }
        return resultServers;
    }
    public static void main(String [] args){
        count_server kd = new count_server();
        int [][] grid = {
                {1,1,0,0},
                {0,0,1,0},
                {0,0,1,0},
                {0,0,0,1}
        };
        System.out.println(count_server.server(grid));
    }
}
