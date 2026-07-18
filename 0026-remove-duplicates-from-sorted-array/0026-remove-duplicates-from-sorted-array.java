class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        Set<Integer> set1 = new HashSet<>();

        Queue<Integer> q1 = new LinkedList<>();

        for(int i = 0;i<nums.length;i++)
        {
            if(set1.contains(nums[i]))
            {
                continue;
            }
            else
            {
                set1.add(nums[i]);
                q1.offer(nums[i]);
            }
        }

        for(int i = 0;i<set1.size();i++)
        {
            nums[i] = q1.poll();
        }


        return set1.size();
    }
}