class Solution {
    public int solution(int[] common) {
        int answer = 0;
        return answer = (common[1]-common[0] == common[2]-common[1])?common[common.length-1]+(common[2]-common[1]) : common[common.length-1] * (common[1]/common[0]);
    }
}