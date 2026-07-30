class Solution 
{
    public boolean queryString(String s, int n) 
    {
        Map<Integer,Integer> map1 = new HashMap<>();

        for(int i  = s.length() - 1;i>=0;i--)
        {
            int k = 0;
            int sum  = 0;

            for(int j = i;j>=0;j--)
            {
                int digit = s.charAt(j) - '0';

                sum = sum + digit*(int)Math.pow(2,k);

                k++;

                map1.put(sum,1);

            }

        }

        for(int i  = 1;i<=n;i++)
        {
            if(!(map1.containsKey(i)))
            {
                return false;
            }
        }

        return true;
    }
}