import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> al = new ArrayList<String>();
        for(int i=0; i<finished.length; i++){
            if(finished[i] != true){
                al.add(todo_list[i]);
            }
        }
        String[] answer = new String[al.size()];
        answer = al.toArray(answer);
        return answer;
    }
}