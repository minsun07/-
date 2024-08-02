class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int test = x;           //자릿수를 구하다보면 값이 달라지기 때문에
        int sum = 0;            //합계 변수
        while(test!=0){         //자릿수 값 구하기
            sum += test%10;     //sum에 나머지값 더하기
            test/=10;           //위에서 더한 값은 제거
        }
        if(x%sum!=0)            //하샤드 수인지 판별(아니면)
            answer = false;     //false반환
        return answer;          //맞으면 true
    }
}