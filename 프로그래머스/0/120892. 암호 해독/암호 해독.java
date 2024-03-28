class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        //for(int i=1; i<cipher.length(); i++){
            for(int j=code-1; j<cipher.length(); j+=code)
                answer += cipher.charAt(j);
       // }
        return answer;
    }
}