class Solution 
{
    public String smallestSubsequence(String s) 
    {
        int freq[] = new int[27];
        boolean seen[] = new boolean[27];

        Stack<Character> stack1 = new Stack<>();

        for(int i = 0;i<s.length();i++)
        {
            freq[s.charAt(i) & 31]++;
        }

        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            int x = s.charAt(i) & 31;
            freq[x]--;

            if(seen[x])
            {
                continue;
            }

            while(!stack1.isEmpty())
            {
                if(stack1.peek() <= c)
                {
                    break;
                }
                if(freq[stack1.peek() & 31] == 0)
                {
                    break;
                }

                seen[stack1.peek() & 31] = false;
                stack1.pop();

            }

            stack1.push(c);
            seen[x] = true;
        }
        
        StringBuilder  string1 = new StringBuilder();

        for(char c:stack1)
        {
            string1.append(c);
        }

        return string1.toString();
    }
}