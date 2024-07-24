class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){  //문자열의 각 문자 반복
            
            //indexOf() : 현재 문자의 처음 인덱스 번호를 저장
            //따라서 중복되는 문자가 나올 경우 그 문자의 처음 인덱스 번호와 비교하여
            //인덱스 번호가 서로 다르면 answer에 추가하지 x
            if(my_string.indexOf(my_string.charAt(i)) == i)
                answer += my_string.charAt(i); //문자 저장
        }
        return answer;
    }
}