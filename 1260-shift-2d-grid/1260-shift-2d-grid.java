class Solution 
{
    public List<List<Integer>> shiftGrid(int[][] grid, int k) 
    {
        List<List<Integer>> ans = new ArrayList<>();

        int m = grid.length; // no of rows 
        int n = grid[0].length;// no of columns //

        

        for(int i = 0;i<k;i++) // for repeating the operations //
        {
            List<Integer> endele = new ArrayList<>();

            for(int j = 0;j<m;j++)
            {
                endele.add(grid[j][n-1]);
            }

           //now i am iterating over the the first elements from behind //
            for(int row = 0;row<m;row++)
            {
                for(int column = n-2;column>=0;column--)
                {
                    grid[row][column+1] = grid[row][column];
                }
            }

            // now lets take for the end elements //
            int getele = 0;

            for(int row = 1;row<m;row++)
            {
                grid[row][0] = endele.get(getele);
                getele++;
            }

            grid[0][0] = endele.get(getele);
            
        }

        for(int i = 0;i<m;i++)
        {
            List<Integer> tempans = new ArrayList<>();

            for(int j = 0;j<n;j++)
            {
                tempans.add(grid[i][j]);
            }
            ans.add(tempans);
        }


        return ans;
    }
}