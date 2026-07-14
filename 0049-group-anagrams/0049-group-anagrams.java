class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        List<List<String>> ans = new ArrayList<>();
        Set<List<String>> set1 = new HashSet<>();

        for(int i =  0;i<strs.length;i++)
        {
            List<String> tempans = new ArrayList<>();
            tempans.add(strs[i]);

            for(int j = 0;j<strs.length;j++)
            {
                if(i == j) continue;

                if(strs[i].length() != strs[j].length())
                {
                    continue;
                }

                int hash[] = new int[26];

                int k = 0;

                while(k<strs[i].length())
                {
                    int charA = strs[i].charAt(k) - 97;
                    hash[charA]++;

                    int charB = strs[j].charAt(k) - 97;
                    hash[charB]--;

                    k++;
                }
                int flag = 1;
                
                for(int l = 0;l<hash.length;l++)
                {
                    if(hash[l] != 0)
                    {
                        flag = 0;
                        break;
                    }
                }

                if(flag == 1)
                {
                    tempans.add(strs[j]);
                }
            }
            Collections.sort(tempans);

            set1.add(tempans);
        }

        for(List<String> strings:set1)
        {
            ans.add(strings);
        }

        return ans;
    }
}