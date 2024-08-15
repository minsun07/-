class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String strk = Integer.toString(k);  //k를 문자열로 변환
        for(int m=i; m<=j; m++){            //i~j까지 숫자들을 반복
            String value = Integer.toString(m); //i~j를 문자열로 변환
            if(value.contains(strk)){           //value값에 strk가 포함되는지 확인
                String[] array = value.split(""); //새로운 array배열에 value의 각 자리 문자를 넣기
                for(String a : array){
                    if(a.equals(strk)) //a가 strk와 같다면
                        answer++;      //1씩 증가
                }
            }
        }
        return answer;
    }
}