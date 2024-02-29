class Solution {
    public void setZeroes(int[][] nums) {
       int row[]=new int [nums.length];
        int col[]=new int [nums[0].length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(nums[i][j]==0){
                 row[i]=-1;
                    col[j]=-1;
                }
            }
        }        
         for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
            if(row[i]==-1 || col[j]==-1)
             nums[i][j]=0;
            }
         }
    }
}