import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int k = 0;
        Arrays.sort(array);
        k = array.length / 2;
        for(int i=0; i<=k; i++){
            answer = array[k];
        }
        
        return answer;
    }
}