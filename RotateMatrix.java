class Solution {
    public void rotate(int[][] arr) 
    {
for(int i=0;i<arr.length;i++){
    for(int j=i;j<arr[0].length;j++){ // why j==i see once the ele is swapped wehn it go to 01 swap with 10 but when it go to 10 swap with 01 swapped again  eenu avoid karna va appa nai ta swap karan to pala aala he matrix milju ga 
         int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
    }
}
// keep s and e inside coz after new row it has to start from begining and end again
for(int i=0;i<arr.length;i++){
int s=0;  
int e=arr[i].length-1;
    while(s<e){
     int temp=arr[i][s];
        arr[i][s]=arr[i][e];
        arr[i][e]=temp;
        s++;
        e--;
    }
  }
 }
}

      // approach for vid ref sumit sir
      // now first swap the elements with their opp index ele eg 0,1 with 1,0
