class Solution 
{
    public int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return gcd(b,a%b);
        }
    }
    public int findGCD(int[] nums) 
    {
        Arrays.sort(nums);
        return gcd(nums[nums.length-1],nums[0]);
    }
}