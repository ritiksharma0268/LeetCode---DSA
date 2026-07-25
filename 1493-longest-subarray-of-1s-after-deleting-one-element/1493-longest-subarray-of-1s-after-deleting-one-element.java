class Solution 
{
    public int longestSubarray(int[] nums) 
    {
        int left = 0;

        int right = 0;

        int count0 = 0;

        int maxlen  = 0;

        while(right < nums.length)
        {
            if(nums[right] == 0)
            {
                count0++;
            }

            while(count0 > 1)
            {
                if(nums[left] == 0)
                {
                    count0--;
                }
                left++;
            }

            maxlen = Math.max(right - left + 1,maxlen);
            right++;
        }

        return maxlen-1;
    }
}