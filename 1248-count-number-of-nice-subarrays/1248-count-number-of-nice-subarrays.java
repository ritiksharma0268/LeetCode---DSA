class Solution 
{
    public int numberofsubarrayslessthan(int[] nums,int k)
    {
        if(k < 0)
        {
            return 0;
        }


        int left = 0;

        int right = 0;

        int count = 0;  

        int ans = 0;     

        while(right < nums.length)
        {
            if(nums[right]%2 != 0)
            {
                count++;
                
            }

            while(count>k)
            {
                if(nums[left]%2 != 0)
                {
                    count--;
                }
                left++;
            }
            if(count<=k)
            {
                ans += (right - left + 1);
            }
            right++;
        } 

        return ans;
    }

    public int numberOfSubarrays(int[] nums, int k) 
    {
        int x = numberofsubarrayslessthan(nums,k);
        int y  = numberofsubarrayslessthan(nums,k-1);

        return x - y;

    }
}