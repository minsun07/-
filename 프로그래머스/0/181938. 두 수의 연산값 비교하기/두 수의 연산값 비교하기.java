class Solution {
    public int solution(int a, int b) {
        String sa = a + "" + b;
        int ia = Integer.parseInt(sa);
        int answer = ia > 2*a*b ? ia : 2*a*b;
        return answer;
    }
}