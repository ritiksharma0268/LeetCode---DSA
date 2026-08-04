class Solution 
{
    public List<Integer> findMissingElements(int[] nums) 
    {
        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();

       List<Integer> temp = new ArrayList<>();

       for(int i = 0;i<nums.length;i++)
       {
            temp.add(nums[i]);
       }

       for(int i  = nums[0];i<=nums[nums.length - 1];i++)
       {
            if(!temp.contains(i))
            {
                ans.add(i);
            }
       }

        return ans;
    }
}