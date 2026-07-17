class Solution 
{
    public String reverseOnlyLetters(String s) 
    {
        int left = 0;
        int right = s.length() - 1;

        char alpha[] = s.toCharArray();

        while(left<=right)
        {
            if(alpha[left]<65 || (alpha[left]>=91 && alpha[left]<=96 ))
            {
                left++;
            }
            else if(alpha[right]<65 || (alpha[right]>=91 && alpha[right]<=96))
            {
                right--;
            }
            else
            {
                char temp = alpha[left];
                alpha[left] = alpha[right];
                alpha[right] = temp;
                left++;
                right--;
            }
        }

        for(int i = 0;i<alpha.length;i++)
        {
            System.out.println(alpha[i]);
        }

        String str2 = new String(alpha);
        return str2;
    }
}