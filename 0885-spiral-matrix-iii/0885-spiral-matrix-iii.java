class Solution 
{
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) 
    {
        int ans[][] = new int[rows*cols][2];

        int directions[][] = {{0,1},{1,0},{0,-1},{-1,0}};

        int dir = 0;

        int steps = 0;

        ans[0][0] = rStart;
        ans[0][1] = cStart;
         
        int count = 1;

        while(count < rows*cols)
        {
            if(dir == 0 || dir == 2)
            {
                steps++;
            }
            for(int i = 0;i<steps;i++)
            {
                rStart = rStart + directions[dir][0];
                cStart = cStart + directions[dir][1];

                if(rStart >= 0 && rStart<rows && cStart >= 0 && cStart < cols)
                {
                    ans[count][0] = rStart;
                    ans[count][1] = cStart;
                    count++;
                }
                
            }

            dir = (dir+1)%4;
        }

        return ans;
    }
}