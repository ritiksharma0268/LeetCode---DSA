class Solution 
{
    public String mergeAlternately(String word1, String word2) 
    {
        int index1 = 0;
        int index2 = 0;

        String ans = "";

        int i = 0;

        while(index1 < word1.length() || index2 < word2.length())
        {
            if(index1<word1.length())
            {
                ans += word1.charAt(index1);
                index1++;
            }
            if(index2 < word2.length())
            {
                ans += word2.charAt(index2);
                index2++;
            }
        }

       


        return ans;

    }
}