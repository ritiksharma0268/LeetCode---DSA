class Solution 
{
    public char nextGreatestLetter(char[] letters, char target) 
    {
        int n = letters.length;
        int index = -1;

        int min = Integer.MAX_VALUE;

        for(int i = letters.length - 1;i>=0;i--)
        {

            if(target == letters[i])
            {
                continue;
            }

            int diff = letters[i] - target;

            if(diff>0 && diff<min)
            {
                min = diff;
                index = i;
            }
        }

        if(index != -1)
        {
            return letters[index];
        }

        return letters[0];
    }
}