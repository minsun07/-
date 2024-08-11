class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i=0; i<numbers.length; i++){
            answer += numbers[i]; //배열값 다 더하기
        }
        return 45-answer; //0~9까지의 숫자의 합(전체) : 45 에서 배열값 빼기 = 구하려는 값
    }
}