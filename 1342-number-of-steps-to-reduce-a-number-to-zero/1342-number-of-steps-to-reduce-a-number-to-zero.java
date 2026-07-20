class Solution 
{
    public int numberOfSteps(int num) 
    {
        int count  = 0;

        while(num != 0)
        {
            if(num % 2 == 0)
            {
                count++;
                num = num/2;
                continue;
            }
            if(num  % 2 != 0)
            {
                count++;
                num = num-1;
                continue;
            }
        }

        return count;
    }
}