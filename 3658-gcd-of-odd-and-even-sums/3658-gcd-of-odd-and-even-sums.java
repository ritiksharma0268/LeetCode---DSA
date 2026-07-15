class Solution 
{
    public int gcd(int a,int b)
    {
        if(b == 0)
        {
            return a;
        }
        else
        {
            return gcd(b,a%b);
        }
    }
    public int gcdOfOddEvenSums(int n) 
    {
        int sumodd = 0;
        int sumeven = 0;
        int oddstart = 1;
        for(int i = 2;i<=2*n;i+=2)
        {
            sumeven += i;
            sumodd += oddstart;
            oddstart += 2;
        }
        return gcd(sumodd,sumeven);
    }
}