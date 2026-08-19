class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] result=sentence.split(" ");

        for(int i=0;i<result.length;i++){
            if(result[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}
        
    
