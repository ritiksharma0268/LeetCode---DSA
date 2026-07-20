class Solution 
{
    public int countConsistentStrings(String allowed, String[] words) 
    {
        
        List<Character> list1 = new ArrayList<>();
        int count  = 0;

        for(int i = 0;i<allowed.length();i++)
        {
            list1.add(allowed.charAt(i));
            
        }

        for(int i = 0;i<words.length;i++)
        {
            int flag = 1;
            for(int j = 0;j<words[i].length();j++)
            {
                if(list1.contains(words[i].charAt(j)))
                {
                    flag = 1;
                }
                else
                {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
            {
                count++;
            }
        }
        return count;
    }
}