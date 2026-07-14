class Solution 
{
    public String shortestCompletingWord(String licensePlate, String[] words) 
    {
        List<Character> list1 = new ArrayList<>();

        for(int i = 0;i<licensePlate.length();i++)
        {
            if(licensePlate.charAt(i) == '1' || licensePlate.charAt(i) == '2' ||licensePlate.charAt(i) == '3' ||licensePlate.charAt(i) == '4' ||licensePlate.charAt(i) == '5' ||licensePlate.charAt(i) == '6' ||licensePlate.charAt(i) == '7' ||licensePlate.charAt(i) == '8' ||licensePlate.charAt(i) == '9' ||licensePlate.charAt(i) == ' ' || licensePlate.charAt(i) == '0' )
            {
                continue;
            }

            if(licensePlate.charAt(i)<97)
            {
                list1.add(Character.toLowerCase(licensePlate.charAt(i)));
            }
            else
            {
                list1.add(licensePlate.charAt(i));
            }
        }

        System.out.println(list1);
        int min = Integer.MAX_VALUE;

        String ans = "-1";

        for(int i = 0;i<words.length;i++)
        {
            List<Character> copy = new ArrayList<>(list1);

            for(int j = 0;j<words[i].length();j++)
            {
                if(copy.contains(words[i].charAt(j)))
                {
                    copy.remove(Character.valueOf(words[i].charAt(j)));
                }
            }
            if(copy.size() == 0)
            {
                if(words[i].length()<min)
                {
                    ans = words[i];
                    min = words[i].length();
                }
            }
        }
        

       return ans;
    }
}