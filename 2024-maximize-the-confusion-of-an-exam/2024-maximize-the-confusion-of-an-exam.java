class Solution 
{
    public int maxConsecutiveAnswers(String answerKey, int k) 
    {
        int left = 0;
        
        int right = 0;

        int maxf = 0;

        int maxlen = 0;

        int changes = 0;

        int hash[] = new int[26];

        while(right <  answerKey.length())
        {
            hash[answerKey.charAt(right) - 'A']++;

            maxf = Math.max(maxf,hash[answerKey.charAt(right) - 'A']);

            changes = (right - left + 1) - (maxf);

            while(changes > k)
            {
                hash[answerKey.charAt(left) - 'A']--;
                left++;

                int nextmax = 0;
                for(int i = 0;i<26;i++)
                {
                    nextmax = Math.max(nextmax,hash[i]);
                }
                maxf = nextmax;

                changes = (right - left + 1) -(maxf);
            }

            maxlen = Math.max(maxlen,(right - left + 1));

            right ++;
        }

        return maxlen;
    }
}