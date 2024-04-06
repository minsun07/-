class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int der=0;
        if(a%2!=0 && b%2!=0){
            answer = a*a + b*b;
        }
        else if(a%2==0 && b%2==0){
            der = a - b;
            if(der<0){
                answer = der*-1;
            }
            else
            answer = der;
        }
        else{
            answer = 2* (a+b);
        }
        return answer;
    }
}