class Solution 
{
    public int[] resultsArray(int[] nums, int k) 
    {
        // let us use the concept of sliding window //

        int n = nums.length;

        int ans[] = new int[n-k+1];

        int left = 0;

        int right = 0;

        Map<Integer,Integer> map1 = new HashMap<>();

        int maxi = -1;

        int j = 0;

        while(right < nums.length)
        {
             map1.put(nums[right],right);


            if((right - left + 1) > k)
            {
                left++;
            }

            if((right - left + 1) == k)
            {
                int flag = 1;

                for(int i  = left+1;i<=right;i++)
                {
                    if(nums[i] <= nums[i-1] || nums[i] != nums[i-1] + 1)
                    {
                        flag = 0;
                        break;
                    }
                }
                if(flag == 0)
                {
                    ans[j] = -1;
                }
                else
                {
                    ans[j] = nums[right];
                }
                j++;
            }

            right++;
        }

        return ans;
    }
}