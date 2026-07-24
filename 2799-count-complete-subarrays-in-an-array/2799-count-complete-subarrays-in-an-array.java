class Solution 
{
    public int numberofSubarraylessthan(int[] nums,int k)
    {
        if(k == 0)
        {
            return 0;
        }

        int left  = 0;
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

            count +=  (right - left + 1);

           right ++;

        }
        return count;
    }


    public int countCompleteSubarrays(int[] nums) 
    {
        Set<Integer> set1 = new HashSet<>();

        for(int i  = 0;i<nums.length;i++)
        {
            set1.add(nums[i]);
        }

        int k = set1.size();

        int x = numberofSubarraylessthan(nums,k);
        int y  = numberofSubarraylessthan(nums,k-1);

        return x-y;
    }
}