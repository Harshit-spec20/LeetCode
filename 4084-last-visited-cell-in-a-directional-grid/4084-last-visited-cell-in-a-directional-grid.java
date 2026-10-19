class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        boolean [][] visited=new boolean[m][n];

        int r=0;
        int c=0;
        visited[r][c]=true;

        while(true){
            int nextR=r;
            int nextC=c;

            if(grid[r][c]=='L'){
                nextC--;
            }else if(grid[r][c]=='R'){
                nextC++;
                
            }else if(grid[r][c]=='U'){
                nextR--;
                
            }else if(grid[r][c]=='D'){
                nextR++;
                
            }
            if(nextR >=0 && nextR<m && nextC >= 0 && nextC < n && !visited[nextR][nextC]){
                r=nextR;
                c=nextC;
                visited[r][c]=true;
            }else{
                break;
            }
        }
        return new int[]{r,c};
        
    }
}