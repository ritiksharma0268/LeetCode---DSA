class Solution 
{
    public int maxActiveSectionsAfterTrade(String s) 
    {
        // this is the most optimal appraoch //
        int count1 = 0;

        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i) == '1')
            {
                count1++;
            }
        }

        List<Integer> list1 = new ArrayList<>();

        int i = 0;

        while(i < s.length())
        {
            if(s.charAt(i) == '0')
            {
                int start = i;
                while(i < s.length() && s.charAt(i) == '0')
                {
                    i++;
                }
                list1.add(i-start);
            }
            else
            {
                i++;
            }
            
        }

        if(list1.size() == 1)
        {
            return count1;
        }

        int bestpair = 0;

        for(int j = 1;j<list1.size();j++)
        {
            bestpair = Math.max(bestpair,list1.get(j) + list1.get(j-1));
        }

        return bestpair + count1;
    }
}