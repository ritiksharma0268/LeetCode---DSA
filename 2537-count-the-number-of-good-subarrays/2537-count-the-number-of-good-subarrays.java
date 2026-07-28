class Solution 
{
    public long countGood(int[] nums, int k) 
    {

        // this is a good sliding question in order to know the number of subarrays //
        // this approach can be learnt by dry run very well//
        Map<Integer,Integer> map1 = new HashMap<>();

        int left = 0;

        int right = 0;

        int count = 0;

        long ans = 0;

        while(right < nums.length)
        {
            k -= map1.getOrDefault(nums[right],0); // at first it there was any repetition just remove it as we have got that many 
            map1.put(nums[right],map1.getOrDefault(nums[right],0) + 1); // then secondly keeep adding it 

            while(k <= 0)
            { // as soon as it gets over now its your time to regain them back for counting the another subarrays 
                map1.put(nums[left],map1.get(nums[left]) - 1);
                k += map1.get(nums[left]); // how much we have lost from them 
                left++;
            }

            ans += left; // the number of pairs you can form 
            right++;
        }

        return ans;
    }
}