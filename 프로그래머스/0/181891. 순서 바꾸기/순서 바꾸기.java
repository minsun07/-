class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int indx = 0;
        for(int i=n; i<num_list.length; i++){
            answer[indx++] = num_list[i];
        }
        for(int i=0; i<n; i++){
            answer[indx++] = num_list[i];
        }
        return answer;
    }
}