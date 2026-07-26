class Solution 
{
    public int subarraysLessThan(int[] nums,int k)
    {
        int left = 0;

        int right = 0;

        int count = 0;
        

        Map<Integer,Integer> map1 = new HashMap<>();

        while(right < nums.length)
        {
            if(map1.containsKey(nums[right]))
            {
                map1.put(nums[right],map1.get(nums[right]) + 1);
            }
            else
            {
                map1.put(nums[right],1);
            }

            while(map1.size() > k)
            {
                map1.put(nums[left],map1.get(nums[left]) - 1);
                
                if(map1.get(nums[left]) == 0)
                {
                    map1.remove(nums[left]);
                }
                left++;

            }

            if(map1.size() <= k)
            {
                count += (right - left + 1);
            }
            right++;
        }

        return count;

    }
    public int subarraysWithKDistinct(int[] nums, int k) 
    {
        int x =  subarraysLessThan(nums,k);
        int y =  subarraysLessThan(nums,k-1);

        return x-y;
    }
}