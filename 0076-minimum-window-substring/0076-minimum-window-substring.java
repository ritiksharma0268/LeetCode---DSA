class Solution 
{
    public String minWindow(String s, String t) 
    {
        // this is a great question of sliding window where every step is dependent on the dry run process //

        if(t.length() > s.length())
        {
            return "";
        }
        
        int hash[] = new int[256];

        for(int i = 0;i<t.length();i++)
        {
            hash[t.charAt(i)]++;
        }

        int size = t.length();

        int left = 0;
        int right = 0;

        int count = 0;
        int minlen = Integer.MAX_VALUE;
        int si = -1;

        while(right < s.length())
        {
            if(hash[s.charAt(right)] > 0)
            {
                count++;
            }
            hash[s.charAt(right)]--;

            while(count == size)
            {
                if((right - left + 1) < minlen)
                {
                    minlen = (right - left + 1);
                    si = left;
                }

                hash[s.charAt(left)]++;
                if(hash[s.charAt(left)] > 0)
                {
                    count--;
                }

                left++;

            }

            right++;

        }

        if(si == -1)
        {
            return "";
        }

        String ans = "";

        for(int i = si;i<si+minlen;i++)
        {
            ans += s.charAt(i);
        }


        return ans;

    }
}



// the extreme brute force appraoch would be to generate all the subarrays but this is not possible for this question as 
// the power is clearly 10power5

// the basic code proceeds like that //


        // Map<Character,Integer> original = new HashMap<>();

        // for(int i  = 0;i<t.length();i++)
        // {
        //     if(original.containsKey(t.charAt(i)))
        //     {
        //         original.put(t.charAt(i),original.get(t.charAt(i))+1);
        //     }
        //     else
        //     {
        //         original.put(t.charAt(i),1);
        //     }
        // }

        // int length = original.size();

        // for(int i = 0;i<s.length();i++)
        // {
        //     Map<Character,Integer> map1 = new HashMap<>(original);

        //     int index = -1;

        //     for(int j = i;j,s.length();j++)
        //     {
        //         if(map1.containsKey(s.charAt(j)))
        //         {
        //             if(map1.get(s.charAt(j)) > 0)
        //             {
        //                 count++;
        //             }
        //             map1.put(s.charAt(j),map1.get(s.charAt(j)) -1);
        //         }
        //         else
        //         {
        //             map1.put(s.charAt(j),-1);
        //         }

        //         if(count == length)
        //         {
        //             index = j;
        //             break;
        //         }
        //     }

        // }