import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 0;
        //정수 나누기로 구하기
        while(n>0){  //반복 횟수가 정해져 있지 않으므로 while문 사용
            sum += n%10;
            n/=10;  
        }
        
        //문자열로 만들어서 구하기
        String s = Integer.toString(n);  //정수 타입 n을 문자열로 변환
        for(int i=0; i<s.length(); i++){
            sum += Integer.parseInt(s.substring(i,i+1));
        }
        return sum;
    }
}