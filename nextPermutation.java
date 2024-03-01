// lets code from scratch
class Solution {
    //reverse method
    public void reverse(int nums[],int i){
        int j=nums.length-1;
        while(i<=j){
           swap(nums,i,j);
            i++;
            j--;
        }
    }
    // swap method
     public void swap(int nums[],int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
     }
    //main method 
    public void nextPermutation(int[] nums) {
       int i=nums.length-2;
        // this will stop at i at index or point at which ele is smaller coz we are seeing i and i+1 ele so i is at the index point if we found one 
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        // point where over thinking has to go away seer if i>=0 then just find the next greater ele and swap it
        if(i>=0){
            int j=nums.length-1;
            while(i>=0 && nums[j] <=nums[i]) 
                j--;
            // now we got the number just greater so stop and swap them
            swap(nums,i,j);
        }
        
        // time to reverse rest of everything
        reverse(nums,i+1); 
    }
}

// code got accepted after 15 plus iterations 
// everytime its checking i>=0 to make sure its not getting array index out of bound 