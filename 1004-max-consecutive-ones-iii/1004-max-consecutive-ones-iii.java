// just reframe the question of longest subarray with atmost k zeroes //

class Solution 
{
    public int longestOnes(int[] nums, int k) 
    {
        int n = nums.length;

        int left = 0;
        int right = 0;
        int zeros = 0;

        int maxlen = 0;

        while(right < n)
        {
            if(nums[right] == 0)
            {
                zeros++;
            }
            if(zeros>k)
            {
                if(nums[left] == 0)
                {
                    zeros--;
                }   
                left++;   
            }
            if(zeros<=k)
            {
                maxlen = Math.max(maxlen,right-left+1);
            }
            right++;
        }
        return maxlen;
    }
}



//  // this is the better approach //
//         // we are doing using the two pointer and sliding window appraoch  //
//         int n = nums.length ;

//         int left = 0;
//         int right  = 0;

//         int zero  = 0;

//         int maxlen  = 0;


//         while(right < n)
//         {
//             if(nums[right] == 0)
//             {
//                 zero++;
//             }
//             if(zero > k)
//             {
//                 while(nums[left] != 0)
//                 {
//                     left++;
//                 }
//                 left++;
//                 zero--;
//             }
//             maxlen = Math.max(maxlen,right-left+1);
//             right++;
//         }

//         return maxlen;