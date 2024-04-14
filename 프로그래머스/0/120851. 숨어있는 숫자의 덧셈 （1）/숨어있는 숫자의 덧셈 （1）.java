class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String rs = my_string.replaceAll("[^0-9]", "");
        
        for(int i=0; i<rs.length(); i++){
          answer += Integer.parseInt(String.valueOf(rs.charAt(i)));
            
        }
        return answer;
    }
}