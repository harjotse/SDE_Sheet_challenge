class Solution {
    public int maxProfit(int[] nums) {
     int profit=0;
     int profitMax=0;
     int minCost=nums[0];

     for(int i=0;i<nums.length;i++){
      minCost=Math.min(minCost,nums[i]);
     profit=nums[i]-minCost;
     profitMax=Math.max(profitMax,profit);
      System.out.println(profitMax); 
     }
return profitMax;
    }
} 

//  0 1 2 3 4 5 day number
// [7,1,5,3,6,4] cost at that day number 
// nums[5]=4

// min =1  // jado appa sab to katt amt ich purchase kita si 
  
// cost=3 { 4-1=3 }  // ajj da profit 
  
// profit=5 // jera sanu pala hoya si profit 

//simple logic
// buy on the day when its lowest and also check through out if by chance we can get it even lower
// now check the cost bought on lowest what will i get if sold today
// now check what if today we are getting a pro of 5 but older day gave us 9 so profit shall be max
// 0 1 2 3 4 5 day number
//[7,1,5,3,6,4] cost at that day number 