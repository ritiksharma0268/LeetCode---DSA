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

        for(int i  = 0;i<nums.length;i++)
        {
            System.out.println(nums[i] + " ");
        }

        int flag = 1;

        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] == 0)
            {
                flag = 0;
                break;
            }
        }

        if(flag == 0)
        {
            return -1;
        }

        return ans;
        
    }
}