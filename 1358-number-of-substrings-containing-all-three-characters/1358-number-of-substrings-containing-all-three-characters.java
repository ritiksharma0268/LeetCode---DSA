class Solution 
{
    public int numberOfSubstrings(String s) 
    {
        int indexa = -1;int indexb = -1;int indexc = -1;

        int count = 0;


        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i) == 'a') indexa = i;
            if(s.charAt(i) == 'b') indexb = i;
            if(s.charAt(i) == 'c') indexc = i;

            if(indexa != -1 && indexb != -1 && indexc != -1 )
            {
                int min = Math.min(indexa,indexb);
                min = Math.min(min,indexc);
                count += (min+1);
            }
        }

        return count;
    }
}