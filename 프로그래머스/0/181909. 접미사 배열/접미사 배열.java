import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        int length = my_string.length();
        String[] answer = new String[length];  //접미사의 갯수가 문자열 길이와 같다
        
        for(int i=0; i<my_string.length(); i++){ //문자열 길이만큼 반복
            answer[i] = my_string.substring(i);  //answer배열에 자른 문자열 넣기
                                                 //"banana" 
                                                 //ex) i=0, a <- 인덱스번호로 자름
                                                 //    i=2, ana
        }
        Arrays.sort(answer); //배열의 원소를 오름차순으로 정렬
        return answer;
    }
}