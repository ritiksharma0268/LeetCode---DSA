class Solution 
{
    public int vowelcount(String s)
    {
        int count = 0;

        String vowel = "aeiou";

        char alpha[] = s.toCharArray();

        for(int i = 0;i<alpha.length;i++)
        {
            if(vowel.indexOf(alpha[i]) != -1)
            {
                count++;
            }
        }

        return count;
    }
    public String reverseWords(String s) 
    {
        // this is the most optimised solutions //

        String words[] = s.split(" ");

        int first = vowelcount(words[0]);

        for(int i = 1;i<words.length;i++)
        {
            if(vowelcount(words[i]) == first)
            {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }

        String newstring = String.join(" ",words);

        return newstring;
    }
}