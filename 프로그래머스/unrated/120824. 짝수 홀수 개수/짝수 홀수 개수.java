class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int k=0, r=0;
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0)  //짝수
                k++;
            else                  //홀수
                r++;
            answer[0] = k;
            answer[1] = r;
        }
        return answer;
    }
}