class Solution 
{
    public int maximumProduct(int[] nums) 
    {
        // the key was observation //
        Arrays.sort(nums);

        int prod1 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

       
        
        int prod2 = nums[0]*nums[1]*nums[nums.length-1];
        
        if(prod2>prod1)
        {
            return prod2;
        }
        return prod1;

    }
}