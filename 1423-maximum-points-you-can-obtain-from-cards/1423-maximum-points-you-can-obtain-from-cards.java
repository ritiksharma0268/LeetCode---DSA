class Solution 
{
    public int maxScore(int[] cardPoints, int k) 
    {
        // brute force appraoch//
        int sum = 0;

        

        for(int i = 0;i<k;i++)
        {
            sum += cardPoints[i];
        }

        int maxsum = sum;

        int j = cardPoints.length - 1;

        for(int i = 0;i<k;i++)
        {
            sum -= cardPoints[k-i-1];
            
            sum += cardPoints[j-i];

            maxsum = Math.max(maxsum,sum);
        }


        return maxsum;
       
    }
}