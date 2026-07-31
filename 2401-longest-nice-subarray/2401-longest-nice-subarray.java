class Solution 
{
    public int longestNiceSubarray(int[] nums) 
    {
        // this involves a method known as bitmasking //

        // bitmasking tells if something is common it will never become zero //


        int left = 0;
        int right  = 0;

        int bitmask = 0;
        int maxlen  = 0;

        while(right < nums.length)
        {
            while((bitmask & nums[right]) != 0)
            {
                bitmask = bitmask ^ nums[left];
                left++;
            }

            bitmask = bitmask | nums[right];
            maxlen = Math.max(maxlen,(right - left + 1));
            right++;
        }

        return maxlen ;
       
    }
}