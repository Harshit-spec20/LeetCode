class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();
        int i=0;
        int j=0;
        while(i<s.length()){
            if(j<spaces.length && i==spaces[j]){
                result.append(" ");
                j++;
            }
            result.append(s.charAt(i));
            i++;
        }
        return result.toString();

        
    }
}