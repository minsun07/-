import java.util.*;
class Solution {
    public List solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        for(int a : arr){
            answer.add(a);  //list에 arr값이 들어감
        }
        for(int del : delete_list){
            int index = answer.indexOf(del);
            if(index != -1){ //해석 : 같은 원소를 찾았다
                answer.remove(index);
            }
        }
        return answer;
    }
}