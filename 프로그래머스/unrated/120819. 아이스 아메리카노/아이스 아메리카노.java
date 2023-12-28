class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int cups = money/5500;
        int rest = money%5500;
        answer[0] = cups;
        answer[1] = rest;
        return answer;
    }
}