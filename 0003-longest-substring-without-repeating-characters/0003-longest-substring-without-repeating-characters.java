class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        // now let us do using the two pointer or sliding window approach  //
        Map<Character,Integer> map1 = new HashMap<>();

        int len = 0;
        int maxlen = 0;

        int left = 0;
        int right = 0;

        while(right < s.length())
        {
            if(map1.containsKey(s.charAt(right)) && map1.get(s.charAt(right)) >= left)
            {
                left = map1.get(s.charAt(right)) + 1;
                
            }
            
                len = right - left + 1;
                maxlen = Math.max(len,maxlen);
                map1.put(s.charAt(right),right);
                right++;
            
        }

        return maxlen;

      

       
    }
}










// this is the most brute appraoch the key point was to note that we had only 100 unique characters //


//    char alpha[] = s.toCharArray();   
        
//         int max = 0;

//         int len = alpha.length ;

//         if(len>100)
//         {
//             len = 100;
//         }
        
//         for(int i = 0;i<alpha.length;i++)
//         {
//             List<Character> list1 = new ArrayList<>();
//             int count = 0;

//             for(int j = i;j<len;j++)
//             {
//                 if(list1.contains(alpha[j]))
//                 {
//                     break;
//                 }
//                 list1.add(alpha[j]);
//                 count++;
//             }
//             if(count>max)
//             {
//                 max = count;
//             }
//         }

//         return max;





   