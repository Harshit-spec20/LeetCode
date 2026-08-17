class Solution {
    public int maxVowels(String s, int k) {
        int count=0,max=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                count ++;
            }if(i>=k && isVowel(s.charAt(i-k))){
                count--;
            }
            max=Math.max(count,max);
        }
        return max;
        
    }
    
    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
}