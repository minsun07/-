class Solution {
    public int solution(int[] num_list) {
        int answer = 0, h=0, j=0;
        for(int i=0; i<num_list.length; i++){
            if(i%2==0){
                h+=num_list[i];
            }
            else{
                j+=num_list[i];
            }
        }
        answer = h>j?h:j;
        return answer;
    }
}