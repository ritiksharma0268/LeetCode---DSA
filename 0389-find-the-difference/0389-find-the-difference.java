class Solution 
{
    public char findTheDifference(String s, String t) 
    {
       
        int hash[] = new int[123];

        for(int i = 0;i<s.length();i++)
        {
            hash[s.charAt(i)]++;
        }
    
        for(int i = 0;i<t.length();i++)
        {
            hash[t.charAt(i)]--;
        }

        for(int i = 0;i<hash.length;i++)
        {
            if(hash[i] != 0)
            {
                 return (char)i;
            }
        }

        return ' ';
    }
}