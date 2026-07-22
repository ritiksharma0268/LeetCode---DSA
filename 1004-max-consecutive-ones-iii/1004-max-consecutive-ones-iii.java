class Solution 
{
    public int longestOnes(int[] nums, int k) 
    {
        int n = nums.length ;

        int left = 0;
        int right  = 0;

        int zero  = 0;

        int maxlen  = 0;


        while(right < n)
        {
            if(nums[right] == 0)
            {
                zero++;
            }
            if(zero > k)
            {
                while(nums[left] != 0)
                {
                    left++;
                }
                left++;
                zero--;
            }
            maxlen = Math.max(maxlen,right-left+1);
            right++;
        }

        return maxlen;
    }
}