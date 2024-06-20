class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();  //문자열 s 소문자로 만들기
        int pp = 0;
        int yy = 0;
        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i); //문자열 char형으로 변환 //한글자씩 비교하기 위해
            if(a=='p') pp++;
            if(a=='y') yy++;
        }        
        answer = (pp==yy) ? true : false;  

        return answer;
    }
}