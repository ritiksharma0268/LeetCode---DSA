class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {

        if(s.length() == 1)
        {
            return 1;
        }

       char alpha[] = s.toCharArray();
       int n = alpha.length;
       int max = 0;

       for(int i = 0;i<n;i++)
       {
            List<Character> list1 = new ArrayList<>();
            int count = 0;

            for(int j = i;j<n;j++)
            {
                if(list1.contains(alpha[j]))
                {
                    break;
                }
                list1.add(alpha[j]);
                count++;
            }
            if(count>max)
            {
                max = count;
            }
       }

       return max;
    }
}