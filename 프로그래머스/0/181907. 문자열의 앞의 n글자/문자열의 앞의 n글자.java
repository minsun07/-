class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i=0; i<n; i++){
            char one = my_string.charAt(i);
            answer += one;
        }
        
        return answer;
    }
}