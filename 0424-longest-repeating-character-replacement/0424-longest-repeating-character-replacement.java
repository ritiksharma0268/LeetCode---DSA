class Solution 
{
    public int characterReplacement(String s, int k) 
    {
        // we have to do this using sliding window //

        int left = 0;
        int right = 0;

        int maxlen = 0;

        int maxf = 0;

        int changes = 0;

        int hash[] = new int[26];


        while(right < s.length())
        {
            hash[s.charAt(right) - 'A']++;

            maxf = Math.max(hash[s.charAt(right) - 'A'],maxf);

            changes = (right - left + 1) - (maxf);

            if(changes > k)
            {
                hash[s.charAt(left) - 'A']--;
                left++;
                int nextmax = 0;

                for(int i = 0;i<26;i++)
                {
                    nextmax = Math.max(nextmax,hash[i]);
                }

                maxf = nextmax;

                changes = (right - left + 1) - (maxf);
            }
            if(changes <= k)
            {
                maxlen = Math.max(maxlen,right - left + 1);
            }

            right ++;

        }

        return maxlen;
        

    }
}