import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        
        String[] rs = my_string.replaceAll("[^0-9]", "").split("");
        
        Arrays.sort(rs);
        
        int[] answer = new int[rs.length];
        
        for(int i=0; i<answer.length; i++){
            
            answer[i] = Integer.parseInt(rs[i]);
        }
        return answer;
    }
}