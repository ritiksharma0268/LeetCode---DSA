class Solution 
{
    public String mergeAlternately(String word1, String word2) 
    {
        int index1 = 0;
        int index2 = 0;

        char ans[] = new char[word1.length() + word2.length()];

        int i = 0;

        while(index1 < word1.length() || index2 < word2.length())
        {
            if(index1<word1.length())
            {
                ans[i] = word1.charAt(index1);
                i++;
                index1++;
            }
            if(index2 < word2.length())
            {
                ans[i] = word2.charAt(index2);
                i++;
                index2++;
            }
        }

        String answer = new String(ans);


        return answer;

    }
}