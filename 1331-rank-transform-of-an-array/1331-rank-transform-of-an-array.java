class Solution 
{
    public int[] arrayRankTransform(int[] arr) 
    {
        int n = arr.length;

        if(n == 0)
        {
            return arr;
        }

        int ans[] = new int[n];

        int tempans[] = new int[n];

        for(int i =  0;i<n;i++)
        {
            tempans[i] = arr[i];
        }

        Arrays.sort(tempans);

        Map<Integer,Integer> map1 = new HashMap<>();
        map1.put(tempans[0],1);

        int rank = 1;

        for(int i = 1;i<tempans.length;i++)
        {
            if(tempans[i] == tempans[i-1])
            {
                map1.put(tempans[i],rank);
                continue;
            }
            else
            {
                rank++;
                map1.put(tempans[i],rank);
            }
        }

        System.out.println(map1);

        for(int i = 0;i<ans.length;i++)
        {
            if(map1.containsKey(arr[i]))
            {
                ans[i] = map1.get(arr[i]);
            }
        }
        return ans;
    }
}