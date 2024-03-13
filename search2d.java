class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int j=matrix[0].length-1;
        int i=0;
        while(i<matrix.length && j>=0)
        {
            if(matrix[i][j]==target)
                return true;
           else if(matrix[i][j]>target)
                j--;
            else
                i++; 
        }
        return false;
    }
}


// binary search approach 
// sumeet sir sde sheet leetcode patterns 
//amazon fb ms adobe apple 



//  int j=arr[0].length-1;
//         while(i<arr.length && j>=0)
//         {
//             if(arr[i][j]==target)
//                 return true;
//                 else if(arr[i][j]>target)
//                     j--;
//             else
//                 i++;
                    