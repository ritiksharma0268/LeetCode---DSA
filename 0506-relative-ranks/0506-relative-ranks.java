class Solution 
{
    public String[] findRelativeRanks(int[] score) 
    {
        //you can do all the  questions ritik you just need patience and right logical thinking //
        int n = score.length;

        String ans[] = new String[n];

        int temp[] = new int[n];

        for(int i = 0;i<n;i++)
        {
            temp[i] = score[i];
        }

       
        Arrays.sort(temp);

        

        int one = 0;
        int sec = 0;
        int third = 0;

        for(int i = n-1;i>=0;i--)
        {
            for(int j = 0;j<n;j++)
            {
                if(temp[i] == score[j] && one == 0)
                {
                    ans[j] = "Gold Medal";
                    one++;
                    break;
                }
                else if(temp[i] == score[j] && sec == 0)
                {
                    ans[j] = "Silver Medal";
                    sec++;
                    break;
                }
                else if(temp[i] == score[j] && third == 0)
                {
                    ans[j] = "Bronze Medal";
                    third++;
                    break;
                }
                else if(temp[i] == score[j])
                {
                    ans[j] = String.valueOf(n-i);
                    break;
                }
            }
        }

        return ans;
    }
}