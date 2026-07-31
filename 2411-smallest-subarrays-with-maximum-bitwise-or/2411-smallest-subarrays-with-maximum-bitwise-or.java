class Solution 
{
    public int[] smallestSubarrays(int[] nums) 
    {
        int n = nums.length;

        int setindex[] = new int[32];

        Arrays.fill(setindex,-1);

        int ans[] = new int[nums.length];


        for(int i = n-1;i>=0;i--)
        {
            int endindex = i;

            for(int j = 0;j<32;j++)
            {
                if((nums[i] & (1<<j)) == 0)
                {
                    if(setindex[j] != -1)
                    {
                        endindex = Math.max(endindex,setindex[j]);
                    }
                }
                else
                {
                    setindex[j] = i;
                }
            }

            ans[i] = endindex - i+1;

        }

        return ans;

        
    }
}