class Solution {
    public List<List<Integer>> generate(int n) {
    List<List<Integer>> ans= new ArrayList<List<Integer>>();
      // for final ans 
      if(n<=0)
        return ans;
      int j=0; // to keep the count of the row 
      while(j<n){
        ArrayList<Integer> List=new ArrayList<>();
        
        for(int i=0;i<=j;i++){
          if(i==0 || i==j){
          List.add(1);
          }
          else{
            List.add(ans.get(j-1).get(i)+ans.get(j-1).get(i-1));
          }
        }// for ended 
        j++;
        ans.add(List); // hun add vi karo list nu ans vich 
      }// while ended 
    return ans;
    }
          }