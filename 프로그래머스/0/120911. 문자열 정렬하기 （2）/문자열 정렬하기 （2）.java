import java.util.*;

class Solution {
    public String solution(String my_string) {      
        my_string = my_string.toLowerCase();   //모든 문자 소문자로 바꾸기
        char[] arr = my_string.toCharArray();  //문자열을 char로 만들어 char배열에 넣기
        Arrays.sort(arr);                      //오름차순으로 정렬하기
        String answer = new String(arr);       //문자열로 만들기
        return answer;
    }
}