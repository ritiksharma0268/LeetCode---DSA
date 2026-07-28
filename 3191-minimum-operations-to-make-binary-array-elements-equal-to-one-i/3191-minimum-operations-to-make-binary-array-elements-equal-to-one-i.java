class Solution 
{
    public int minOperations(int[] nums) 
    {
        int left = 0;

        int right = 0;

        int ans  = 0;

        while(right <  nums.length)
        {
            if(nums[right] == 0)
            {
                left = right ;
                if(left<nums.length-2)
                {
                     for(int i = left;i<left+3;i++)
                    {
                        if(i < nums.length)
                        {
                            if(nums[i] == 0)
                            {
                                nums[i] = 1;
                            }
                            else if(nums[i] == 1)
                            {
                                nums[i] = 0;
                            }
                        }
                    }
                }

                ans++;
            }

            right++;
        }

        if(nums[nums.length - 1] == 0 || nums[nums.length-2] == 0)
        {
            return -1;
        } 
        
      
        return ans;
        
    }
}