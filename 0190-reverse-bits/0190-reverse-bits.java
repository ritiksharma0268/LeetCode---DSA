class Solution 
{
    public int reverseBits(int n) 
    {
        List<Integer> list1 = new ArrayList<>();

        for(int i = 0;i<32;i++)
        {
            list1.add(n%2);
            n = n/2;
        }

        int sum = 0;
        int j = 0;

        for(int i = list1.size() - 1;i>=0;i--)
        {
            sum += list1.get(i)*Math.pow(2,j);
            j++;
        }


        return sum;

    }
}