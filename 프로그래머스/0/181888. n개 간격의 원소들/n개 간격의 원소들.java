import java.util.*;
class Solution {
    public List solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        int j=0;
        for(int i=0; i<num_list.length; i+=n){
            answer.add(num_list[i]);
        }
        return answer;
    }
}