class Solution 
{
    public int minOperations(int[] nums) 
    {
        int n = nums.length;

        int ans = 0;

        for(int i  = 0;i<=n-3;i++)
        {
            if(nums[i] == 0)
            {
                nums[i] = nums[i]^1;
                nums[i+1] = nums[i+1]^1;
                nums[i+2] = nums[i+2]^1;

                ans++;
            }
        }

        if(nums[nums.length - 1] == 0 || nums[nums.length-2] == 0)
        {
            return -1;
        } 

        return ans;
        
        
    }
}






        // // this is the sliding window approach by the moving the pointer by 3  every time we encounter 0//
        
        // int left = 0;

        // int right = 0;

        // int ans  = 0;

        // while(right <  nums.length)
        // {
        //     if(nums[right] == 0)
        //     {
        //         left = right ;
        //         if(left<nums.length-2)
        //         {
        //              for(int i = left;i<left+3;i++)
        //             {
        //                 if(i < nums.length)
        //                 {
        //                     if(nums[i] == 0)
        //                     {
        //                         nums[i] = 1;
        //                     }
        //                     else if(nums[i] == 1)
        //                     {
        //                         nums[i] = 0;
        //                     }
        //                 }
        //             }
        //         }

        //         ans++;
        //     }

        //     right++;
        // }
        // // i had to check only the last two elements //


        // if(nums[nums.length - 1] == 0 || nums[nums.length-2] == 0)
        // {
        //     return -1;
        // } 
        
      
        // return ans;