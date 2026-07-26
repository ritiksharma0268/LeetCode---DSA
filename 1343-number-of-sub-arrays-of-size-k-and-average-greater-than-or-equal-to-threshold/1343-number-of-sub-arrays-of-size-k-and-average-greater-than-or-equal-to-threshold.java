class Solution 
{
    // public int subarrays(int[] arr,int k,int threshold)
    // {
    //     int n = arr.length;

    //     int left = 0;
    //     int right = 0;

    //     int sum = 0;

    //     int avg = 0;

    //     int count = 0;

    //     while(right < arr.length)
    //     {
    //         sum += arr[right];

    //         avg = sum/k;

    //         while((right - left + 1) > k)
    //         {
    //             sum -= arr[left];
    //             left++;
    //             avg = sum/k;
    //         }

    //         if((right - left + 1) == k && avg <= threshold)
    //         {
    //             count++;
    //         }
            
    //         right++;
    //     }

    //     return count;
    // }

    public int numOfSubarrays(int[] arr, int k, int threshold) 
    {
        int left = 0;

        int right = 0;

        int ans = 0;

        int sum = 0;

        int avg = 0;

        while(right < arr.length)
        {
            sum += arr[right];

            while((right - left + 1) >k)
            {
                sum -= arr[left];
                left++;
            }

            avg = sum/k;

            if((right - left + 1) == k && avg >= threshold)
            {
                ans++;
            }

            right++;
        }

        return ans;
        

    }
}