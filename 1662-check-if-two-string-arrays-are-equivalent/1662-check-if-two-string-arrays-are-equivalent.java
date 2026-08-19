class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1=" ";
        String str2=" ";
        int index=0;

        while(index<word1.length || index<word2.length){
            if(index<word1.length){
                str1=str1+word1[index];
            }if(index<word2.length){
                str2=str2+word2[index];

            }
            index++;
        }
        return str1.equals(str2);
    }
}