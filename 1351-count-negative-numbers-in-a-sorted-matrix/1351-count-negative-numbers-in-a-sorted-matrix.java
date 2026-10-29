class Solution {
    public int countNegatives(int[][] grid) {
        int rn=grid.length;
        int cn= grid[0].length;
        int count=0;
        for (int i=0;i<rn;i++)
        {
            for (int j=0;j<cn;j++)
            {
                if (grid[i][j]<0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}