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

    public long gcdSum(int[] nums) 
    {
        int n = nums.length;

        int maximum[] = new int[n];

        int maxi = Integer.MIN_VALUE;


        int prefixgcd[] = new int[n];

        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] > maxi)
            {
                maxi = nums[i];
                maximum[i] = maxi;

                prefixgcd[i] = gcd(nums[i],maximum[i]);
            }
            else
            {
                maximum[i] = maxi;
                prefixgcd[i] = gcd(nums[i],maximum[i]);
            }
        }

        Arrays.sort(prefixgcd);

        int left = 0;
        int right = prefixgcd.length - 1;
        long sum = 0;

        while(left<right)
        {
            sum += gcd(prefixgcd[left],prefixgcd[right]);
            left++;
            right--;
        }

        return sum;
    }
}