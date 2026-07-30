class Solution 
{
    public boolean queryString(String s, int n) 
    {
        // now let us use the function which will make our code optimal //

        for(int  i = 1;i<=n;i++)
        {
            String binary = Integer.toBinaryString(i);

            if(!(s.contains(binary)))
            {
                return false;
            }
        }


        return true;
    }
}