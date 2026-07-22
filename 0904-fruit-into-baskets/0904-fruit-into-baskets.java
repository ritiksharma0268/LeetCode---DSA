class Solution 
{
    public int totalFruit(int[] fruits) 
    {
         // now i am gonna do these using the concept of sliding window //
         // visulisation is everything //
        int n = fruits.length;

        Map<Integer,Integer> map1 = new HashMap<>();

        int maxlen  = 0;

        int left = 0;
        int right  = 0;

        while(right < n)
        {
            if(map1.containsKey(fruits[right]))
            {
                map1.put(fruits[right],map1.get(fruits[right])+1);
            }
            else
            {
                map1.put(fruits[right],1);
            }

            if(map1.size() > 2)
            {
                while(map1.size() > 2)
                {
                    map1.put(fruits[left] , map1.get(fruits[left]) - 1);
                    if(map1.get(fruits[left]) == 0)
                    {
                        map1.remove(fruits[left]);
                    }
                    left++;
                }
            }
            maxlen = Math.max(maxlen,right - left + 1);
            right ++;
        }


        return maxlen;


    }
}