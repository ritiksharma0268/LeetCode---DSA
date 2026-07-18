class Solution {
public:
    long long maximumValue(int n, int s, int m) 
    {
        // if(n%2==0)
        //     n++;
        long long int n_ = (long long int)n,s_ = (long long int)s, m_ = (long long int)m;
        long long int ans = 0;
        if(n_%2==0)
            ans = s_ + ((n_/2)*m_) - ((n_-1)/2);
        else
            ans = s_ + ((n_/2)*m_) - ((n_-2)/2);
        return ans;
    }
};