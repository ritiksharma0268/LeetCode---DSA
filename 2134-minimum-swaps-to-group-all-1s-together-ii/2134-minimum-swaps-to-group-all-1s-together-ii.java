class Solution 
{
    public int minSwaps(int[] nums) 
    {
       // this is a total intuition based qs if u have seen it somewhere you will be able to do it //

       int count1 = 0;

       for(int i  = 0;i<nums.length;i++)
       {
            if(nums[i] == 1) count1++;
       }
       // this is a question of constant sliding window //

       int current  = 0;

       for(int i  = 0;i<count1;i++)
       {
            if(nums[i] == 0) current++;
       }

       int left = 0;
       int right  = count1-1;

       int minzeroes = current;

       while(left< nums.length)
       {
            if(nums[left] == 0)
            {
                current--;
            }
            left++;
            right++;
            if(nums[right%(nums.length)] == 0)
            {
                current++;
            }
            minzeroes = Math.min(current,minzeroes);
       }

       return minzeroes;
    }
}