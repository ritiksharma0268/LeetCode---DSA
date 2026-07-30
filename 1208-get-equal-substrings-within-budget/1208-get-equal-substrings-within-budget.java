class Solution 
{
    public int equalSubstring(String s, String t, int maxCost) 
    {
        // you have to use the two pointer approach in order to solve the problem //


        int left = 0;

        int right = 0;

        int count  = 0;

        int maxlen  = 0;


        while(right <  s.length())
        {
           
            count += Math.abs(s.charAt(right) - t.charAt(right));

            while(count > maxCost)
            {
                count -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            maxlen  = Math.max(maxlen,(right - left + 1));

            right++;

        }


        return maxlen;


        
    }
}