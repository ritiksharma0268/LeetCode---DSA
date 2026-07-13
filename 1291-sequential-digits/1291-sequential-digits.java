class Solution 
{
    public List<Integer> sequentialDigits(int low, int high) 
    {
        List<Integer> ans = new ArrayList<>();

        for(int i = 1;i<=9;i++)
        {
            int num = i;
            for(int j = i+1;j<=9;j++)
            {
                num = num*10+j;
                if(num>=low && num <= high)
                {
                    ans.add(num);
                }
            }
        }

        Collections.sort(ans);
        return ans;

    }
}



        // // this is the brute force approach //
        // List<Integer> ans = new ArrayList<>();

        // for(int i = low;i<=high;i++)
        // {
        //     int num = i;
        //     int rem = num%10;
        //     num = num/10;
        //     int flag = 1;
        //     while(num != 0)
        //     {
        //         if((num%10 + 1) != rem)
        //         {
        //             flag =0;
        //             break;
        //         }
        //         rem = num%10;
        //         num = num/10;
        //     }

        //     if(flag == 1)
        //     {
        //         ans.add(i);
        //     }

        // }

        // return ans;