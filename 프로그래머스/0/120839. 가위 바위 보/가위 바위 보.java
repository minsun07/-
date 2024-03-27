class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        char s = '2';
        char r = '0';
        char p = '5';
        
        for(int i=0; i<rsp.length(); i++){
            if(rsp.charAt(i) == s){
                answer += r;
            }
            else if(rsp.charAt(i) == r){
                answer += p;
            }
            else{
                answer += s;
            }
        }
        return answer;
    }
}