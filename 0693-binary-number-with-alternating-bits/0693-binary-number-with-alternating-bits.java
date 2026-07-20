class Solution 
{
    public boolean hasAlternatingBits(int n) 
    {
        if(n == 1)
        {
            return true;
        }

        List<Integer> list1 = new ArrayList<>();

        while(n != 0)
        {
            list1.add(n%2);
            n = n/2;
        }
        System.out.println(list1);

        for(int i  = 1;i<list1.size();i++)
        {
            if( list1.get(i-1) != list1.get(i))
            {
                continue;
            }
            return false;
        }

        return true;
    }
}