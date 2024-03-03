// we have 2 approaches 
// first is ON2
// other is kadaes

// kadanes algo 
class Solution {
    public int maxSubArray(int[] nums) {
      int sum=0;
        int maxSum=nums[0];
        for(int i=0;i<nums.length;i++){
         sum+=nums[i];
            maxSum=Math.max(sum,maxSum);
            if(sum<0)
                sum=0;
        }
        return maxSum;
    }
}

// approach of kadanes algo
//watch tuf vid for reference or check notes 
// see just go through the array and store sum if the sum by adding the current idx val is - then
// make the sum zero coz 0>- num 
// if it is not then at every idx store the sum and match it with a var that contains over all sum that we are checking to get the max sum 
// simple

// now the point is where u also have the subarray that the question
