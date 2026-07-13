class Solution 
{
    public String reverseVowels(String s) 
    {
        char alpha[] = s.toCharArray();

        List<Character> vowels = new ArrayList<>();

        for(int i = 0;i<alpha.length;i++)
        {
            if(alpha[i] == 'a' || alpha[i] == 'e' || alpha[i] == 'i' || alpha[i] == 'o' || alpha[i] == 'u' || alpha[i] == 'A' || alpha[i] == 'E' || alpha[i] == 'I' || alpha[i] == 'O' || alpha[i] == 'U')
            {
                vowels.add(alpha[i]);
            }
        }
        int k = 0;

        for(int i = alpha.length-1;i>=0;i--)
        {
            if(alpha[i] == 'a' || alpha[i] == 'e' || alpha[i] == 'i' || alpha[i] == 'o' || alpha[i] == 'u' || alpha[i] == 'A' || alpha[i] == 'E' || alpha[i] == 'I' || alpha[i] == 'O' || alpha[i] == 'U')
            {
                alpha[i] = vowels.get(k);
                k++;
            }
        }

        String str2 = new String(alpha);

        return str2;
    }
}