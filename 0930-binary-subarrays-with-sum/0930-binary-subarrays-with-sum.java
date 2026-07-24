class Solution 
{
    public int subarraylessthanequalsum(int[] nums,int goal)
    {
        if(goal < 0)
        {
            return 0;
        }

        int left  = 0;
        int right = 0;


        int count = 0;

        int sum = 0;

        while(right < nums.length)
        {
            sum += nums[right];

            while(sum>goal)
            {
                sum -= nums[left];
                left++;
            }

            count += (right - left+1);
            right++;
        }

        return count ;

    }


    public int numSubarraysWithSum(int[] nums, int goal) 
    {
       // now i am going do it using the concept of sliding window //

        //**key concept**//
       // we have to use the concept of knowing how many subarrays is less than or equal to goal and second one is less than equal to goal  - 1//

       int x = subarraylessthanequalsum(nums,goal);
       int y = subarraylessthanequalsum(nums,goal-1);

       return x - y;
    
    }
}