class Solution 
{
    public String reverseVowels(String s) 
    {
        //now using the two pointer approach //
        char alpha[] = s.toCharArray();

        int left = 0;

        int right = alpha.length - 1;

        List<Character> alphabet = new ArrayList<>();

        alphabet.add('a');alphabet.add('e');alphabet.add('i');alphabet.add('o');alphabet.add('u');
        alphabet.add('A');alphabet.add('E');alphabet.add('I');alphabet.add('O');alphabet.add('U');

        while(left<=right)
        {
            if(alphabet.contains(alpha[left]) && alphabet.contains(alpha[right]))
            {
                char temp = alpha[left];
                alpha[left] = alpha[right];
                alpha[right] = temp;
                left++;
                right--;
            }
            else if(!alphabet.contains(alpha[left]))
            {
                left++;
            }
            else if(!alphabet.contains(alpha[right]))
            {
                right--;
            }
        }

        String str2 = new String(alpha);

        return str2;
           
    }
}




// // this is the brute force approach //
//         char alpha[] = s.toCharArray();

//         List<Character> vowels = new ArrayList<>();

//         for(int i = 0;i<alpha.length;i++)
//         {
//             if(alpha[i] == 'a' || alpha[i] == 'e' || alpha[i] == 'i' || alpha[i] == 'o' || alpha[i] == 'u' || alpha[i] == 'A' || alpha[i] == 'E' || alpha[i] == 'I' || alpha[i] == 'O' || alpha[i] == 'U')
//             {
//                 vowels.add(alpha[i]);
//             }
//         }
//         int k = 0;

//         for(int i = alpha.length-1;i>=0;i--)
//         {
//             if(alpha[i] == 'a' || alpha[i] == 'e' || alpha[i] == 'i' || alpha[i] == 'o' || alpha[i] == 'u' || alpha[i] == 'A' || alpha[i] == 'E' || alpha[i] == 'I' || alpha[i] == 'O' || alpha[i] == 'U')
//             {
//                 alpha[i] = vowels.get(k);
//                 k++;
//             }
//         }

//         String str2 = new String(alpha);

//         return str2;





// if(alpha[left] == 'a' || alpha[left] == 'e' || alpha[left] == 'i' || alpha[left] == 'o' || alpha[left] == 'u' || alpha[left] == 'A' || alpha[left] == 'E' || alpha[left] == 'I' || alpha[left] == 'O' || alpha[left] == 'U' && alpha[right] == 'a' || alpha[right] == 'e' || alpha[right] == 'i' || alpha[right] == 'o' || alpha[right] == 'u' || alpha[right] == 'A' || alpha[right] == 'E' || alpha[right] == 'I' || alpha[right] == 'O' || alpha[right] == 'U')
//             {
//                 char temp = alpha[left];
//                 alpha[left] = alpha[right];
//                 alpha[right] = temp;
//                 left++;
//                 right--;
//             }
//             else if(alpha[left] != 'a' || alpha[left] != 'e' || alpha[left] != 'i' || alpha[left] != 'o' || alpha[left] != 'u' || alpha[left] != 'A' || alpha[left] != 'E' || alpha[left] != 'I' || alpha[left] != 'O' || alpha[left] != 'U')
//             {
//                 left++;
//             }
//             else if(alpha[right] != 'a' || alpha[right] != 'e' || alpha[right] != 'i' || alpha[right] != 'o' || alpha[right] != 'u' || alpha[right] != 'A' || alpha[right] != 'E' || alpha[right] != 'I' || alpha[right] != 'O' || alpha[right] != 'U')
//             {
//                 right--;
//             }
