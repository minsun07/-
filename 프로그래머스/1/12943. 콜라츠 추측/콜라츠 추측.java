class Solution {
    public int solution(long num) {
        int count = 0;
        while(true){ //반복 횟수를 알 수 없으므로 while문 사용
            //num이 1인 경우나 작업 횟수가 500일 때 멈추기
            if(num==1 || count>=500) break;  
            
            if(num%2==0){ //짝수일 경우
                num = num/2;
                count++;
            }
            else{       //홀수일 경우
                num = num*3+1;
                count++;
            } 
        }
        //num이 1이면 count(연산횟수를), 아니면 -1 반환
        return (num==1) ? count : -1; 
    }
}