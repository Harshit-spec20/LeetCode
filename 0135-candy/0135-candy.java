class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int[]arr=new int[n];
      for(int i = 0 ; i<n;i++){
        arr[i]=1;
      }
      if(n==1){
        return n;
      }
      else if(n==2){
        if(ratings[0]!=ratings[1]){
            return n+1; }
            else {
                return n;
            }
      }
      else {
        for(int i = 1 ; i<n;i++){
            if(ratings[i]>ratings[i-1]){
                arr[i]=arr[i-1]+1;
                continue;
            }
            else{
                continue;
            }
        }
        for(int i = n-2 ; i>=0 ;i--){
            if(ratings[i]>ratings[i+1]){
                if(arr[i]<=arr[i+1]){
                    arr[i]=arr[i+1]+1;
                }
                else continue;
            }
            else continue;
        }
      }
      int sum = 0;
      for(int i = 0;i<n;i++){
        sum+=arr[i];
      }
      return sum;
    }
}