class Solution {
    public int[] solution(int n, int[] numlist) {
        
        int count = 0;

        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
               count++; //배열의 길이를 구함 
            }
        }
        
        int[] answer = new int[count];
        int j = 0; //배열 인덱스
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n == 0){
                answer[j] = numlist[i];
                j++;
            }
        }
        return answer;
    }
}