class Solution 
{
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) 
    {
      
        // we have to go by the nature whether the owner is grumpy or not by the maxsum //
        // as it is mentioned consecutive we have to think in terms of subarray hence we think of sliding window  //

        // we have to know how many people are unsatisfied //

        int current  = 0;
        int max = 0;

        for(int i = 0;i<minutes;i++)
        {
            max += (customers[i] * grumpy[i]);
        }

        current = max;

        int left = 0;
        int right  = minutes - 1 ;


        while(right+1 < customers.length)
        {
            current -= (customers[left] * grumpy[left]);
            left++;
            
            right++;
            current += (customers[right] * grumpy[right]);
            
            max = Math.max(max,current);
        }

        for(int i  = 0;i<customers.length;i++)
        {
            if(grumpy[i] == 0)
            {
                max += customers[i];
            }
        }

        return max;

    }
}