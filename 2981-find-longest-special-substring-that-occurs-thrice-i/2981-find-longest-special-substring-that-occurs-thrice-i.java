class Solution 
{
    public int maximumLength(String s) 
    {
        
        // extreme naive solution will be create all the substrings //

        Map<String,Integer> map1 = new HashMap<>();

        
        

        for(int i = 0;i<s.length();i++)
        {
            String temp = "";
            char tempchar = s.charAt(i);

            

            for(int j = i;j<s.length();j++)
            {
                if(s.charAt(j) != tempchar)
                {
                    break;
                }
                temp = temp + s.charAt(j);

                if(map1.containsKey(temp))
                {
                    map1.put(temp,map1.get(temp) + 1);
                }
                else
                {
                    map1.put(temp,1);
                }

                
            }
        }

       
        int maxlen = -1;

        String maxstring = "";

        for(String key:map1.keySet())
        {
            if(map1.get(key) >= 3)
            {
                if(key.length() >= maxstring.length())
                {
                    maxstring = key;
                    maxlen = key.length();
                }
            }
        }

        
        
        return maxlen;
    
        
    }
}