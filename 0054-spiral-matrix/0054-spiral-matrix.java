class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        // lets do it again //

        int row = matrix.length;
        int column = matrix[0].length;

        int top = 0; int bottom = row - 1;
        int left = 0; int right = column - 1;

        List<Integer> ans = new ArrayList<>();


        while(left <= right && top<= bottom)
        {
            for(int i = left ; i<=right;i++)
            {
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i =  top ; i<= bottom ;i++)
            {
                ans.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom)
            {
                 for(int i = right;i>=left;i--)
                {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right)
            {
                for(int  i = bottom;i>=top;i--)
                {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;

    }
}






//  // this is the optimal approach//
//       int m = matrix.length;// row
//       int n = matrix[0].length;// column
//       ArrayList<Integer> ans = new ArrayList<>();
//       int left = 0; int top = 0;
//       int right =  n-1; int bottom = m-1;

//       while(left <=  right && top<= bottom)// uptil when there is a single row or column edge cases 
//       {
//         for(int i = left;i<=right;i++){
//             ans.add(matrix[top][i]);// performing the right operation 
//         }
//         top++;
//         for(int i = top;i<=bottom;i++){
//             ans.add(matrix[i][right]);// performing the bottom operation
//         }
//         right--;
//         if(top<=bottom)// checking for the edge case
//         {
//         for(int i = right;i>=left;i--)
//          {
//             ans.add(matrix[bottom][i]);// performing the left operation
//          }
//            bottom--;
//         }

//        if(left<=right)// this is single columnn case 
//        {
//         for(int i = bottom;i>=top;i--)
//         {
//             ans.add(matrix[i][left]);// this is for the top operation
//         }
//         left++;
//        }
//       }
      
//         return ans;


