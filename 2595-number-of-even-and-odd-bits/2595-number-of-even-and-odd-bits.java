class Solution 
{
    public int[] evenOddBit(int n) 
    {
        int even = 0;
        int odd = 0;

        int i = 0;

        while(n != 0)
        {
            int newnum = n%2;
            if(newnum == 1 && i%2 == 0)
            {
                even++;
            }
            if(newnum == 1 && i%2 != 0)
            {
                odd++;
            }
            i++;
            n = n/2;
        }

        int ans[] = {even,odd};

        return ans;
    }
}