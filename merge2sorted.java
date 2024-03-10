public / 2 approaches 
// one is this using extra array 
// other is using gap method which is inspired by shell sort
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      ArrayList<Integer> list=new ArrayList<Integer>();
      int j=0,i=0;
      while(j<n && i<m){ // till any one gets exhausted 
        if(nums1[i]<nums2[j]){
          list.add(nums1[i]);
          i++;
        } 
        else{
          list.add(nums2[j]);
          j++;
          }
      }
      // now by the time any one will get exhausted we need to traverse other 
      // for i....
      while(i<m){
        list.add(nums1[i]);
        i++;
      }
      //for j
         while(j<n){
        list.add(nums2[j]);
        j++;
      }
      // for changing the num1
      for(int k=0;k<nums1.length;k++){
         nums1[k]=list.get(k);
      }
    }
}
//make a new array
// now check both the arrays and fill the new array seeing the smaller ele
// now the catch 
// if anyone of the array gets over then the remianing array will be stored 
// after that copy the new array  {
    
}

import java.util.ArrayList;

