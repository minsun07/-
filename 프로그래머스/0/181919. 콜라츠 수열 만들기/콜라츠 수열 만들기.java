import java.util.*;
class Solution {
    public int[] solution(int n) {
        //요약 : 콜라츠 수열은 x가 1이 나오기 전까지 값들의 연산값을 저장하는 수열
        
        List<Integer> answer = new ArrayList<>(); //n이 1이 나올 횟수를 정확히 모르기 때문에
        answer.add(n);  //리스트에 n을 추가
        while(n!=1){    //n이 1이 아닐 때까지 반복
            if(n%2==0){  //짝수일 경우
                n /= 2;
            }
            else{        //홀수일 경우
                n = 3*n+1; 
            }
            answer.add(n);  //answer 리스트에 n값 저장
        }
       return answer.stream().mapToInt(i->i).toArray(); 
       //
    }
}