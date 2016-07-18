/**
 * Number of Islands
 * 
 * Given a boolean 2D matrix, find the number of islands.

 Notice

0 is represented as the sea, 1 is represented as the island. If two 1 is adjacent, we consider them in the same island. We only consider up/down/left/right adjacent.
 * 
 * Example
Given graph:

[
  [1, 1, 0, 0, 0],
  [0, 1, 0, 0, 1],
  [0, 0, 0, 1, 1],
  [0, 0, 0, 0, 0],
  [0, 0, 0, 0, 1]
]
return 3
*/

public class Solution {
    /**
     * @param grid a boolean 2D matrix
     * @return an integer
     */
    public int numIslands(boolean[][] grid) {
        int num = 0;
        int x = grid.length;
        if (x == 0) return 0;
        int y = grid[0].length;
        if (y == 0) return 0;
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (grid[i][j]) {
                    removeIsland(grid, i, j);
                    num ++;
                }
            }
        }
        return num;
    }
    public static void removeIsland(boolean[][] grid, int i, int j) {
        grid[i][j] = false;
        int xlength = grid.length;
        int ylength = grid[0].length;
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        for (int m = 0; m < 4; m++) {
            int newi = i + dx[m];
            int newj = j + dy[m];
            if (newi >= 0 && newi < xlength && newj >= 0 && newj < ylength) {
                if (grid[newi][newj])
                    removeIsland(grid, newi, newj);
            }
        }
    }
}