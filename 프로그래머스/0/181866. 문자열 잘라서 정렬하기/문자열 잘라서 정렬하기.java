import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] strList = myString.split("x");  //"x"를 기준으로 나눈 값을 strList배열에 저장
        ArrayList<String> notempList = new ArrayList<String>(); //배열에 공백이 포함되어 있으므로 공백을 제거하고 넣을 배열 생성(크기를 알 수 없으므로 리스트로 생성)
        for(String str : strList){ //공백이 아닐 경우 리스트에 저장
            if(!str.isEmpty())
                notempList.add(str);
        }
        String[] answer = notempList.toArray(new String[notempList.size()]); //리스트를 다시 배열로 변환
        
        Arrays.sort(answer); //answer을 오름차순 정렬
        
        return answer;
    }
}