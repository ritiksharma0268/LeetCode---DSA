class Solution 
{
    public String reverseWords(String s) 
    {
        String words[] = s.split(" ");

        int constcount = 0;

        for(int i = 0;i<words[0].length();i++)
        {
            if(words[0].charAt(i) == 'a' || words[0].charAt(i) == 'e' ||words[0].charAt(i) == 'i' ||words[0].charAt(i) == 'o' ||words[0].charAt(i) == 'u' )
            {
                constcount++;
            }
        }  

           

        for(int i = 1;i<words.length;i++)
        {
            int vowel = 0;

            for(int j = 0;j<words[i].length();j++)
            {
                if(words[i].charAt(j) == 'a' || words[i].charAt(j) == 'e' ||words[i].charAt(j) == 'i' ||words[i].charAt(j) == 'o' ||words[i].charAt(j) == 'u' )
                {
                    vowel++;
                }
            }

            if(vowel == constcount)
            {
                char word[] = words[i].toCharArray();

                int left = 0;
                int right = word.length - 1;

                while(left <= right)
                {
                    char temp = word[left];
                    word[left] = word[right];
                    word[right] = temp;
                    left++;
                    right--;
                }


                String newsubstring = new String(word);

                words[i] = newsubstring;
            }
        }

        String newstring = "";

        for(int i = 0;i<words.length;i++)
        {
            if(i == words.length - 1)
            {
                newstring = newstring + words[i];
            }
            else
            {
                newstring = newstring + words[i] + " ";
            }
        }

        return newstring;
    }
}