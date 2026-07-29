class Solution 
{
    public int maximumUniqueSubarray(int[] nums) 
    {
        // hardwork is evrything you need to understand //
        int left = 0;

        int right  = 0;

        int sum = 0;

        Map<Integer,Integer> map1 = new HashMap<>();

        int flag  = 0;

        int maxsum = 0;

        while(right  < nums.length)
        {
            sum += nums[right];

            if(map1.containsKey(nums[right]))
            {
                flag = 1;
                map1.put(nums[right],2);
            }
            else
            {
                map1.put(nums[right],1);
            }

            while(flag == 1)
            {
                sum -= nums[left];
                if(map1.get(nums[left]) == 2)
                {
                    flag = 0;
                    map1.put(nums[left],1);
                    left++;
                }
                else
                {
                    map1.remove(nums[left]);
                    left++;
                }
               
            }
                
            
            maxsum = Math.max(sum,maxsum);
            right++;
        }

        return maxsum;
    }
}