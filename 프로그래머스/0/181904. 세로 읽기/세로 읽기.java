import java.util.*;
class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] list = my_string.split("");    //split을 이용한 문자열 배열로 변환
        
        //조건에 맞는 문자를 넣을 배열 초기화
        //크기를 알 수 없으므로 동적배열(리스트)로 만든다.
        ArrayList<String> al = new ArrayList<String>(); 
        
        for(int i=c-1; i<list.length; i+=m){ //c-1부터 시작하여 m만큼 차이로 반복
                                             //c-1 : 인덱스 때문에
            
            al.add(list[i]);                 //배열에 추가
        }
        answer = String.join("",al);         //al배열을 ""으로 합쳐 문자열로 변환
        return answer;
    }
}