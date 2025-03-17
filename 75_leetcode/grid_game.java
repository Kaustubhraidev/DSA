package DSA.array;
import java.lang.Long;

public class grid_game {
    public static long grids(int[][] grid){
        long firstRowRemainSum =0;
        for(int num: grid[0]){
            firstRowRemainSum +=num;
        }

        long secondRemainSum =0;
        long minimizedRobot2Sum = Long.MAX_VALUE;

        for(int Robot1Col =0; Robot1Col < grid[0].length; Robot1Col++){
            firstRowRemainSum -= grid[0][Robot1Col];

            long bestOfRobot2 = Math.max(firstRowRemainSum, secondRemainSum);
            minimizedRobot2Sum = Math.min(minimizedRobot2Sum, bestOfRobot2);

            secondRemainSum += grid[1][Robot1Col];
        }
        return minimizedRobot2Sum;
    }
    public static void main (String[] args){
        grid_game solution = new grid_game();
        int [][] grid = {
                {2,3,4},
                {4,6,7}
        };
        System.out.println(grid_game.grids(grid));
    }
}
