class Solution 
{
    public long minimumSteps(String s) 
    {
        // we have to do it by adjacent opeartions //
        long count = 0;
        
        char digits[] = s.toCharArray();

        long zerocount = 0;

        for(int i  = s.length() - 1;i>=0;i--)
        {
            if(digits[i] == '0')
            {
                zerocount++;
            }
            if(digits[i] == '1')
            {
                count = count + zerocount;
            }
        }
        return count;
    }
}