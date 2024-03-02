// count the number of number of  0,1,2 and then put it manually in array
// use sorting algo or simply arrays.sort
// dutch nation algo
class Solution {
    public void sortColors(int[] nums) {
        int l=nums.length-1;
        int m=0;
        int s=0;
        while(m<=l){ // here its not S<=l its m coz m will roam around 
            if(nums[m]==0){// s will stop going further after it get sorted 
                swap(nums,m,s);
                s++;
                m++;
            }
            else if(nums[m]==1){
                m++;
            }
            else {
                swap(nums,l,m);
                l--; 
                //see keep the mid till mid only because see
                // picho vi l is coming to mind and  s,m is also heading to mid
                // what does this means ki jive jive aage vade jande ha 
                // its getting sorted
            }
        }
    }
    void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

// the only obeservation is the m is the king how is driving the whole code 