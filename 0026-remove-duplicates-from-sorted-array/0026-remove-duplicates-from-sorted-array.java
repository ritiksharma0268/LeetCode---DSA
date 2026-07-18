class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        // classic example of two pointers

        int i = 1;

        for(int j = 1;j<nums.length;j++)
        {
            if(nums[j] != nums[i-1])
            {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}





//  // this is using queue data set //
//         Set<Integer> set1 = new HashSet<>();

//         Queue<Integer> q1 = new LinkedList<>();

//         for(int i = 0;i<nums.length;i++)
//         {
//             if(set1.contains(nums[i]))
//             {
//                 continue;
//             }
//             else
//             {
//                 set1.add(nums[i]);
//                 q1.offer(nums[i]);
//             }
//         }

//         for(int i = 0;i<set1.size();i++)
//         {
//             nums[i] = q1.poll();
//         }


//         return set1.size();