class Solution 
{
    public int numSubarraysWithSum(int[] nums, int goal) 
    {
        // now we are going to do it using the concept of prefix sum //

        // start relating the question //
        int count = 0;

        Map<Integer,Integer> map1 = new HashMap<>();

        int prefixsum = 0;

        map1.put(0,1);

        for(int i = 0;i<nums.length;i++)
        {
            prefixsum = prefixsum + nums[i];

            if(map1.containsKey(prefixsum - goal))
            {
                count += map1.get(prefixsum - goal);
            }

            if(map1.containsKey(prefixsum))
            {
                map1.put(prefixsum,map1.get(prefixsum)+1);
            }
            else
            {
                map1.put(prefixsum,1);
            }

        }

        return count;


    }
}