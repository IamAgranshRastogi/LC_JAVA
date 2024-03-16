class Solution {
    public String reverseWords(String s) {
        if(s==null||s.length()==0){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        int pos=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)==' '){
                pos=0;
                continue;
            }
            if(pos==0){
                sb.insert(pos,' ');
                pos++;
            }
            sb.insert(pos,s.charAt(i));
            pos++;
        }
       return sb.toString().trim();
    }
}