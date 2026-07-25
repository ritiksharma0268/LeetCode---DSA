class Solution 
{
    public long countSubarrays(int[] nums, int k) 
    {
        // the understanding is very good of this question //
        int maxi = -1;

        for(int i = 0;i<nums.length;i++)
        {
            maxi = Math.max(maxi,nums[i]);
        }

        int left = 0;
        int right = 0;

        int count = 0;

        long ans = 0;

        while(right < nums.length)
        {
            if(nums[right] == maxi)
            {
                count++;
            }

            while(count >= k)
            {
                if(nums[left] == maxi)
                {
                    count--;
                }
                left++;
            }

            ans += left;
            right++;

        }


        return ans;
        
    }
}