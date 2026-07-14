class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
       if(s.length() !=  t.length())
       {
            return false;
       }

       int alpha[] = new int[26]; // we have done hashing here //

        int k = 0;
        
        while(k < s.length())
        {
            int chara = s.charAt(k) - 97;

            alpha[chara]++;

            int charb = t.charAt(k) - 97;

            alpha[charb]--;

        k++;
        }

        for(int i = 0;i<alpha.length;i++)
        {
            if(alpha[i] != 0)
            {
                return false;
            }
        }

        return true;
       
    }
}