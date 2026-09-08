class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list=new ArrayList<>();
        int length=s.length();
        int window=p.length();

        if(length<window){
            return list;
        }

        int[]sArr=new int[26];

        int[]pArr=new int[26];

        for(int i=0;i<window;i++){
            int si=s.charAt(i)-'a';
            int pi=p.charAt(i)-'a';

            sArr[si]++;
            pArr[pi]++;
        }
        if(Arrays.equals(sArr,pArr))
        {
            list.add(0);
        }
    
        for(int i=1;i<=length-window;i++){
            int prev=s.charAt(i-1)-'a';
            int next=s.charAt(i+window-1)-'a';
            sArr[prev]--;
            sArr[next]++;
           

            if(Arrays.equals(sArr,pArr)){
                list.add(i);
            }
        }
        return list;
        
    }
}