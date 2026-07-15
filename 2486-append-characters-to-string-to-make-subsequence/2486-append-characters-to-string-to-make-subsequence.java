class Solution 
{
    public int appendCharacters(String s, String t) 
    {
        // the O(s.length()) solution //
        int  k = 0;

        for(int i = 0;i<s.length();i++)
        {
            if(k<t.length())
            {
                if(s.charAt(i) == t.charAt(k))
                {      
                    k++;
                }
            }
        }

        return t.length() - k;
    }
}




// // the O(s.length()) solution //
//         int  k = 0;

//         for(int i = 0;i<s.length();i++)
//         {
//             if(k<t.length())
//             {
//                 if(s.charAt(i) == t.charAt(k))
//                 {      
//                     k++;
//                 }
//             }
//         }

//         return t.length() - k;