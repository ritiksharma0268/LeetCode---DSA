class Solution 
{
    public int numberOfArithmeticSlices(int[] nums) 
    {
        

        int ans = 0;

        for(int i  = 0;i<nums.length-1;i++)
        {
            int constant  =  nums[i+1] - nums[i];

            int count = 0;

            for(int j = i+1;j<nums.length;j++)
            {
                if(nums[j] - nums[j-1] == constant)
                {
                    count++;
                }
                else
                {
                    break;
                }

                if(count >= 2)
                {
                    ans++;
                }
            }

        }

        return ans;
    }
}